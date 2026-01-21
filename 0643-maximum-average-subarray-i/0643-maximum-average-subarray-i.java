class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int i=0;
        int j=0;
        int sum=0;
        double max=Integer.MIN_VALUE;

        while(j<nums.length)
        {
             if(j-i+1>k)
             {
                 sum-=nums[i];
                 i++;
             }
             sum+=nums[j];
             if(j-i+1==k)
             {
             double avg=sum/(double)k;
             max=Math.max(max,avg);
             }
             j++;
        }

       return max;
    }
}