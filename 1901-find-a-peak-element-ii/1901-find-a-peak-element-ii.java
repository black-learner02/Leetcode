class Solution {
    public int[] findPeakGrid(int[][] mat) {
 
    int low=0;
    int high=mat[0].length;

    while(low<=high)
    {
        int mid=(low+high)/2;

        int row=find(mat,mid);

        int left=0;
        int right=0;

        if(mid==0)
        {
           left=-1;
        }
        else
        {
            left=mat[row][mid-1];
        }

        if(mid==mat[0].length-1)
        {
            right=-1;
        }
        else
        {
            right=mat[row][mid+1];
        }

        if(mat[row][mid]>left && mat[row][mid]>right)
        {
            return new int[]{row,mid};
        }
        else if(right>mat[row][mid])
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }

    }
     return new int[]{-1,-1};


    }
        

    public static int find(int[][] mat,int mid)
    {
       int row=0;
       int max=Integer.MIN_VALUE;

        for(int i=0;i<mat.length;i++)
        {
            if(mat[i][mid]>max)
            {
            max=mat[i][mid];
               row=i;
            }
        }

        return row;
    }
}