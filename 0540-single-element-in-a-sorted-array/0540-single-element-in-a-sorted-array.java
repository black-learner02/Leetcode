class Solution {
    public int singleNonDuplicate(int[] nums) {

        int low=1;
        int high=nums.length-2;
        int ans=0;
        if(nums.length==1)
        {
            return nums[0];
        }

        if(nums[low-1]!=nums[low])
        {
            return nums[low-1];
        }

        if(nums[high]!=nums[high+1])
        {
            return nums[high+1];
        }
        
        while(low<=high)
        {
          int mid=(low+high)/2;

           if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
           {
             ans=nums[mid];
             break;
          }
          else if(mid%2==0 && nums[mid]==nums[mid+1] || mid%2==1 && nums[mid]==nums[mid-1])
          {
              low=mid+1;
          }
          else
          {
            high=mid-1;
          }

        }
        return ans;
    }
}