class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();

        int maxArea=0;

        for(int i=0;i<heights.length;i++)
        {
           while(!st.isEmpty() && heights[st.peek()]>heights[i])
           {
            int ele=heights[st.pop()];
            int pse=st.isEmpty()?-1:st.peek();
            int nse=i;
 
            maxArea=Math.max(maxArea,ele*(nse-pse-1));
            }
            st.push(i);

        }

        while (!st.isEmpty()) {
            int ele = heights[st.pop()];
            int pse = st.isEmpty() ? -1 : st.peek();
            int nse = heights.length; // End of array

            maxArea = Math.max(maxArea, ele * (nse - pse - 1));
        }

         return maxArea;
     } 
}