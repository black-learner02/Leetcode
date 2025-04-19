class Solution {
    public int splitArray(int[] nums, int k) {


        if(k>nums.length)
        {
            return -1;
        }

        int low=Integer.MIN_VALUE;
        int high=0;

        for(int i=0;i<nums.length;i++)
        {
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(check(nums,mid,k)==true)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
           
           return low;
      
    }
    public static boolean check(int[] arr,int mid,int k)
    {
        int p=1,sum=0;

        for(int i=0;i<arr.length;i++)
        {
            if(sum+arr[i]<=mid)
            {
                sum+=arr[i];
            }
            else
            {
                p++;
                sum=arr[i];
            }
        }
        if(p>k)
        {
            return true;
        }
        return false;
    }
}