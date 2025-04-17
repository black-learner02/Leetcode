class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int low=max(weights);
        int high=find(weights);

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(check(weights,mid,days)==-1)
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

    public static int check(int[] arr,int mid,int days)
    {
        int load=0;
        int day=1;

        for(int i=0;i<arr.length;i++)
        { 
            
           if(load+arr[i]>mid)
           {
              load=0;
              day++;
           }
          
            load+=arr[i];
        }

        if(day>days)
        {
            return -1;
        }
        return 0;
    }
    public static int find(int[] arr)
    {
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
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