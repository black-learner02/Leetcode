class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> st = new Stack<>();

        int n=nums.length;

        int[] res = new int[nums.length];

        for(int i=n*2-1;i>=0;i--)
        {
            int num=nums[i%n];

            while(!st.isEmpty() && st.peek()<=num)
            {
                st.pop();
            }

            if(i<n)
            {
                res[i]=st.isEmpty()?-1:st.peek();
            }

            st.push(num);

        }
        
        return res;
    }
}