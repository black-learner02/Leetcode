class Solution {
    public long countSubarrays(int[] nums, int k) {


        int i=0;
        int j=0;
        long count=0;
        int max=max(nums);
        long res=0;

        while(j<nums.length)
        {
            if(nums[j]==max)
            {
                count++;
            }

            while(count>=k)
            {
               
                if(nums[i]==max)
                {
                    count--;
                }
                i++;
            }
            res+=i;
            j++;
        }

        return res;
        
    }

    public static int max(int[] arr)
    {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}