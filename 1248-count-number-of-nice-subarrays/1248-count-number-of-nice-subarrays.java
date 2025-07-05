class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

      int res=0;

      int i=0;
      int j=0;

      int count=0;


      while(j<nums.length)
      {
        if(nums[j]%2!=0)
        {
            count++;
        }

        
        while(count>k)
        {
            if(nums[i]%2!=0)
            {
                count--;
            }
            i++;
        }

        if(count==k)
        {
            int temp=i;
            while(nums[temp]%2==0)
            {
                temp++;
            }
            res+=temp-i+1;
        }

        j++;
      }

      return res;
    }

   /*   int[] arr = new int[nums.length];

      for(int i=0;i<nums.length;i++)
      {
         if(nums[i]%2==0)
         {
            arr[i]=0;
         }
         else
         {
            arr[i]=1;
         }
      }

      return find(arr,k)-find(arr,k-1);
    }
     public int find(int[] nums,int goal)
    {
         if(goal<0)
         {
            return 0;
         }

        int res=0;

        int i=0;
        int j=0;
        int sum=0;
        while(j<nums.length)
        {
            sum+=nums[j];

           
            while(sum>goal)
            {
                sum-=nums[i];
                i++;
            }

             if(sum<=goal)
            {
                res+=j-i+1;
            }

            j++;
        }

       return res;
    }*/

}