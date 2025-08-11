class Solution {
    public boolean isMonotonic(int[] nums) {

        int inc=0;
        int dec=0;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                dec++;
            }

            if(nums[i]<nums[i+1])
            {
                inc++;
            }
        }


        if(dec>0 && inc>0)
        {
            return false;
        }

        return true;
        
    }
}