class Solution {
    public int dominantIndex(int[] nums) {
        
      int last=Integer.MIN_VALUE;
      int ind=0;

      for(int i=0;i<nums.length;i++)
      {
            if(nums[i]>last)
            {
                last=nums[i];
                ind=i;
            }
      }
 

        for(int i=0;i<nums.length;i++)
        {
            if(i!=ind && nums[i]+nums[i]>last)
            {
                return -1;
            }
        }

        return ind;

    }
}