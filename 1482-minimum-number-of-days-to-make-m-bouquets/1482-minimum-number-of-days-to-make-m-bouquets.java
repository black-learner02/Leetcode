class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

      int n=bloomDay.length;
      int low=1;
      int high=max(bloomDay);
      int ans=0;

      if((long)k*m>n)
      {
        return -1;
      }

      while(low<=high)
      {
        int mid=(low+high)/2;

        if(check(bloomDay,k,mid)>=m)
        {
            high=mid-1;
        }
        else
        {
            low=mid+1;
        }
      }

      return low;
        
    }

    public static int check(int[] arr,int k,int mid)
    {
        int count=0;
        int ans=0;

        for(int i=0;i<arr.length;i++)
        {
           
            if(arr[i]<=mid)
            {
                count++;
            }
            else
            {
                count=0;
            }
             if(count==k)
            {
               ans++;
               count=0;
            }
        }
        return ans;
    }
    public static int max(int[] arr)
    {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
}