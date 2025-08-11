class Solution {
    public int singleNumber(int[] nums) {

        if(nums.length==1)
        {
            return nums[0];
        }


        Arrays.sort(nums);
        int res=0;

        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                if(nums[i]!=nums[i+1])
                {
                   res=nums[i];
                   break;
                }
            }

            else if(i==nums.length-1)
            {
                if(nums[i]!=nums[i-1])
                {
                   res=nums[i];
                   break;
                }
            }
            else
            {
                if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1])
                {
                    res=nums[i];
                    break;
                }
            }
        }

        return res;

        
    }
}