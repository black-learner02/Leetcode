class Solution {
    public boolean check(int[] nums) {


        int temp=0;
        int n=nums.length;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                temp++;
            }
        }

        if(nums[n-1]>nums[0])
        {
            temp++;
        }

        if(temp<=1)
        {
            return true;
        }
        return false;
    }
}