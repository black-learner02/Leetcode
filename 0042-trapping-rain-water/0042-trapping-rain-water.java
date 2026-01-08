class Solution {
    public int trap(int[] height) {

    int i=0;
    int j=height.length-1;

    int vol=0;

    while(height[i]==0)
    {
        i++;
    }

    int leftMax=0;
    int rightMax=0;

//int max=height[i];

    while(i<j)
    {
        if(height[i]<=height[j])
        {
            leftMax=Math.max(leftMax,height[i]);
            vol+=leftMax-height[i];
            i++;
        }
        else if(height[i]>height[j])
        {
            rightMax=Math.max(rightMax,height[j]);
            vol+=rightMax-height[j];
            j--;
        }
       
    }
      return vol;
        
    }
}