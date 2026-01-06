class Solution {
    public void sortColors(int[] nums) {
    /*    int low,mid,high,temp;
        low=0;
        mid=0;
        high=nums.length-1;
        while(mid<=high)
        {
            switch(nums[mid]){
                case 0:{
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
                break;
            }
            case 1:
            {
                mid++;
                break;
            }
            case 2:
            {
                temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
                break;
            }
            }  
        }  */

        int low=0;
        int mid=0;
        int high=nums.length-1;
        int n=nums.length;

        while(mid<=high)
        {
            if(nums[mid]==0)
            {
               swap(low,mid,nums);
               low++;
               mid++;
            }

            else if(nums[mid]==1)
            {
              mid++;
            }

            else
            {
              swap(mid,high,nums);
              high--;
            }

        }

      }

      void swap(int a,int b,int[] arr)
      {
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
      }
}