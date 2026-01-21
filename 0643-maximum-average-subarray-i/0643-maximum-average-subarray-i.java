class Solution {
    public double findMaxAverage(int[] nums, int k) {

       int sum=0;
       double res=Integer.MIN_VALUE;
      int i=0;
      int j=0;

      while(j<nums.length)
      {

          sum=sum+nums[j];
        if(j-i+1>k)
        {
            sum=sum-nums[i];
            i++;
        }
     
        
        if(j-i+1==k)
        {
            res=Math.max(res,(double)sum/k);
        }
        j++;
    
    
    } 
    return res; 
    }
}