class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

       int i=0;

       int j=0;

       int res=0;
       while(j<nums.length)
       {
         
         if(nums[j]==0)
         {
            while(i!=j)
            {
                i++;
            }
            i++;
         }

         res=Math.max(res,j-i+1);

         j++;

       }
        return res;
    }
}