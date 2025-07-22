class Solution {
    public void rotate(int[][] matrix) {


        int n=matrix[0].length;
        int m=matrix.length;

        int[][] res = new int[n][m];

          for(int i=0;i<n;i++)
        {
            int pos=0;
            for(int j=m-1;j>=0;j--)
            {
               res[i][pos]=matrix[j][i];
               pos++;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=res[i][j];
            }
        }
        
    }
}