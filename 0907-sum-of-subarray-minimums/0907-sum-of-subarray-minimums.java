class Solution {
    public int sumSubarrayMins(int[] arr) {

        int[] nse = findNSE(arr);
        int[] psee=findPSEE(arr);
        int mod=(int)1e9+7;
        long total=0;

        for(int i=0;i<arr.length;i++)
        {
            int left=i-psee[i];
            int right=nse[i]-i;

            total=(total+(long)right*left*arr[i])%mod;
        }

        return (int)total;
        
    }

    public static int[] findNSE(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[arr.length];
        int n=arr.length;
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
              st.pop();
            }

            nse[i]=st.isEmpty()?n:st.peek();

            st.push(i);
        }
        return nse;
    }

    public static int[] findPSEE(int[] arr)
    {
        Stack<Integer> st = new Stack<>();

        int[] psee = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            {
                st.pop();
            }
            psee[i]=st.isEmpty()?-1:st.peek();

            st.push(i);
        }
        return psee;
    }
}