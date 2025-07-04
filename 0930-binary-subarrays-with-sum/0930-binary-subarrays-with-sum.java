class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         
         if(goal<0)
         {
            return 0;
         }
        
     return find(nums,goal)-find(nums,goal-1); 

    }

    public int find(int[] nums,int goal)
    {

        if(goal<0)
        {
            return 0;
        }
        int res=0;

        int i=0;
        int j=0;
        int sum=0;
        while(j<nums.length)
        {
            sum+=nums[j];

           
            while(sum>goal )
            {
                sum-=nums[i];
                i++;
            }

             if(sum<=goal)
            {
                res+=j-i+1;
            }

            j++;
        }

       return res;
    }
}