class Solution {
    public int maximumGap(int[] nums) {


        Arrays.sort(nums);

        int diff=Integer.MIN_VALUE;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]>diff)
            {
                diff=nums[i]-nums[i-1];
            }
        }

        return diff==Integer.MIN_VALUE?0:diff;
        
    }
}