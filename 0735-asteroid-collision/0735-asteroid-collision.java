class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();


        for(int i=0;i<asteroids.length;i++)
        {
            if(asteroids[i]>0)
            {
                st.push(asteroids[i]);
            }
            else
            {
               while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i]))
                {
                    st.pop();
                }

                if(!st.isEmpty() && st.peek()==Math.abs(asteroids[i]))
                {
                    st.pop();
                }
                else if(st.isEmpty() || st.peek()<0)
                {
                    st.push(asteroids[i]);
                }
             }
        }

        int[] res = new int[st.size()];
        int pos=0;
        while(!st.isEmpty())
        {
            res[pos++]=st.pop();
        }
        return rev(res);
    }
    public static int[] rev(int[] arr)
    {
        int i=0;
        int j=arr.length-1;

        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}