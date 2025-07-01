class Solution {
    public void setZeroes(int[][] matrix) {
        int l=0;
        int r=0;

        for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				if(matrix[i][j]==0)
				{
					l=i;
					r=j;
					
					
					find(matrix,l,r);
				
				}
			}
		}


        for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				if(matrix[i][j]==-1)
				{
					matrix[i][j]=0;
				}
			}
		}
		
        
    }

    public static int[][] find(int[][] mat,int l,int r)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]!=0 && i==l || mat[i][j]!=0 && j==r)
				{
					mat[i][j]=-1;
				}
			}
		}
		return mat;
  }
}