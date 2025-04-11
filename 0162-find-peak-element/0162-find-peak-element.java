class Solution {
    public int findPeakElement(int[] nums) {
      
      int low=1;
      int high=nums.length-2;

      if(nums.length==1)
      {
        return 0;
      }
      
      if(nums[low-1]>nums[low])
      {
        return low-1;
      }

      if(nums[high]>nums[high+1])
      {
        return high+1;
      }

      int ind=0;

       while(low<=high)
       {
           int mid=(low+high)/2;

           if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1])
           {
            ind=mid;
            break;
           }
           else if(nums[mid]>nums[mid+1])
           {
              low=mid+1;
           }
           else
           {
            high=mid-1;
           }
       }

     return ind;
    }
}