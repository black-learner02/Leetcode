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
            if(nums[i]%2!=0)
            {
                res+=1;
            }
            else
            {
                int temp=i;
                while(nums[temp]%2==0)
                {
                    temp++;
                }

                res+=temp-i+1;
            }
        }

        j++;
      }

      return res;
    }
}