class Solution {
    public int minEatingSpeed(int[] piles, int h) {

   

      int low=1;
      int high=max(piles);

      while(low<=high)
      {
        int mid=low+(high-low)/2;

        if(check(piles,mid)<=h)
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

    public static int check(int[] piles,int n)
    {
        int ans=0;

        for(int i=0;i<piles.length;i++)
        {
            ans+=Math.ceil((double)piles[i]/(double)n);
        }
        return ans;
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