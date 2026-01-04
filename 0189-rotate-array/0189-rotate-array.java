class Solution {
    public void rotate(int[] nums, int k) {

        int n=nums.length;

        int times=k%nums.length;

        rotate(nums,0,n-1);
        rotate(nums,0,k-1);
        rotate(nums,k,n-1);


        
    }

    public static void rotate(int[] arr,int st,int ed)
    {
        int i=st;
        int j=ed;
        
        while(i<=j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
       
    }
}