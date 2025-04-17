class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
    
      int low=1;
      int high=max(nums);
    //  double min=threshold;
      int ans=0;

      while(low<=high)
      {
        int mid=(low+high)/2;

        if(check(nums,mid)<=threshold)
        {
         ans=mid;
      //   min=check(nums,mid);
         high=mid-1;
        }
        else
        {
            low=mid+1;;
        }
        }

      return ans;

    }

    public static double check(int[] arr,int mid)
    {
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=Math.ceil((double)arr[i]/mid);
        }
        return sum;
    }

    public static int max(int[] arr)
    {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
               max=arr[i];
            }
        }

        return max;

    }
}