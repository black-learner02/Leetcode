class Solution {
    public int trap(int[] height) {
       int max1=0;
       int max2=0; 
       int right=height.length-1;
       int left=0;
       int res=0;
       if(height.length==0)
       {
        return 0;
       }
       while(left<right)
       {
       
       if(height[left]<height[right])
       {
        if(height[left]>=max1)
        {
            max1=height[left];
        }
        else
        {
            res+=max1-height[left];
        }
        left++;
       }
       else
       {
        if(height[right]>=max2)
        {
            max2=height[right];
        }
        else
        {
            res+=max2-height[right];
        }
        right--;
       }
       }
      return res;
    }
}