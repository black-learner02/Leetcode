class Solution {
    public int largestRectangleArea(int[] heights) {

         int[] nse = findNSE(heights);

         int[] pse = findPSE(heights);
          
         int total=0;
         for(int i=0;i<heights.length;i++)
         {
            int widht=nse[i]-pse[i]-1;
            int area=heights[i]*widht;
            total=Math.max(area,total);
         } 

         return total; 
        
    }

     public static int[] findNSE(int[] arr)
     {
        int[] res = new int[arr.length];
        int n=arr.length;
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            {
                st.pop();
            }

            res[i]=st.isEmpty()?n:st.peek();

            st.push(i);
        }
        return res;
     }

      public static int[] findPSE(int[] arr)
     {
        Stack<Integer> st = new Stack<>();
        int[] psee = new int[arr.length];

         for(int i=0;i<arr.length;i++)
         {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }

            psee[i]=st.isEmpty()?-1:st.peek();

            st.push(i);
         }
         return psee;
     } 
}