class Solution {
    public int longestOnes(int[] nums, int k) {

    int res=0;

     int i=0;
     int j=0;
     int zero=0;

     while(j<nums.length)
     {

        if(nums[j]==0)
        {
            zero++;
        }
        
        while(zero>k)
        {
            if(nums[i]==0)
            {
                zero--;
            }
            i++;
        }

        res=Math.max(res,j-i+1);
        j++;
     }
    
        return res;
    }
}