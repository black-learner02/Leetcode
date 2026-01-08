class Solution {
    public int maxArea(int[] height) {

      int i=0;
      int j=height.length-1;

      int ans=0;

      while(i<j)
      {
        int hig=Math.min(height[i],height[j]);
        int len=j-i;
        ans=Math.max(ans,hig*len);

        if(height[i]>height[j])
        {
            j--;
        }
        else
        {
            i++;
        }
      }   
        return ans;
    }
}