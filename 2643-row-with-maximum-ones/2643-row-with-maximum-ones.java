class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
       
        int ans2=0;
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<mat.length;i++)
        {
             int temp=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    temp++;
                }
            }
            if(temp>max)
            {
                ans=i;
                ans2=temp;
                max=temp;
            }
        }

        return new int[]{ans,ans2};
        
    }
}