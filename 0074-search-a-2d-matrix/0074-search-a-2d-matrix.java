class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]<=target && target<=matrix[i][matrix[i].length-1])
            {
                return find(matrix[i],target);
            }
        }

        return false;
        
    }

    public static boolean find(int[] arr, int tar)
    {
        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]==tar)
            {
                return true;
            }
            else if(arr[mid]>tar)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return false;
    }
}