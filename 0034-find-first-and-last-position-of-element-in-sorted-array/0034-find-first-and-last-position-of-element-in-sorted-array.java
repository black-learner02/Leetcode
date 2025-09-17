class Solution {
    public int[] searchRange(int[] nums, int target) {


      return new int[]{first(nums,target),second(nums,target)};
    }

    public static int first(int[] arr,int target)
    {
        int low=0;
        int high=arr.length-1;

        int first=-1;

        while(low<=high)
        {

            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
               first=mid;
               high=mid-1; 
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        return first;
    }
     public static int second(int[] arr,int target)
    {
        int low=0;
        int high=arr.length-1;

        int second=-1;

        while(low<=high)
        {

            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
               second=mid;
               low=mid+1; 
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        return second;
    }

    
}