class Solution {
    public long subArrayRanges(int[] nums){

      int[] nse = findNSE(nums);
      int[] psee = findPSEE(nums);
      int[] nge = findNGE(nums);
      int[] pgee = findPGEE(nums);
      long max=0;
      long min=0;
      for(int i=0;i<nums.length;i++)
      {
        int left1=i-psee[i];
        int right1=nse[i]-i;
        int left2=i-pgee[i];
        int right2=nge[i]-i;

         min+=left1*right1*(long)nums[i];
         max+=left2*right2*(long)nums[i];
      }
         
       return max-min;
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

     public static int[] findPSEE(int[] arr)
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


     public static int[] findNGE(int[] arr)
     {
        int n=arr.length;
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]<arr[i])
            {
                st.pop();
            }

            nge[i]=st.isEmpty()?n:st.peek();

            st.push(i);
        }
        return nge;
     }

     public static int[] findPGEE(int[] arr)
     {
        int[] pgee = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
            {
                st.pop();
            }

            pgee[i]=st.isEmpty()?-1:st.peek();

            st.push(i);
        }
        return pgee;
     }      
}