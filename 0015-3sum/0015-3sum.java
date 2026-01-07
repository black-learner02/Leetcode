class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
   /*    HashSet<List<Integer>> set = new HashSet<>();
       int n=nums.length;

       for(int i=0;i<n;i++)
       {
        for(int j=i+1;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if(nums[i]+nums[j]+nums[k]==0)
                {
                List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                temp.sort(null);
                set.add(temp);
            }
            }
        }
       }

       List<List<Integer>> ans = new ArrayList<>(set);
       return ans ;  */

/*       int n=nums.length;
       int temp;
       //HashMap<Integer,Integer> map =new HashMap<>();
       Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++)
       {
        Set<Integer> se = new HashSet<>();
        for(int j=i+1;j<n;j++)
        {
            temp=-(nums[i]+nums[j]);
            if(se.contains(temp))
            {
               List<Integer> tem=Arrays.asList(nums[i],nums[j],temp);
               tem.sort(null);
               set.add(tem);
            }
            se.add(nums[j]);
        }
       }
       List<List<Integer>> list = new ArrayList<>(set);
       return list;  */

       int n=nums.length;
       Arrays.sort(nums);

       List<List<Integer>> list = new ArrayList<>();

       for(int i=0;i<n;i++)
       {
        if(i!=0 && nums[i]==nums[i-1])
        {
            continue;
        }

        int j=i+1;
        int k=n-1;
        while(j<k)
        {
            int sum=nums[i]+nums[j]+nums[k];

            if(sum<0)
            {
                j++;
            }
            else if(sum>0)
            {
                k--;
            }
            else
            {
                List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                list.add(temp);
                
            
        
        
        while(j<k && nums[j]==nums[j+1])
        {
            j++;
        }
        while(j<k && nums[k]==nums[k-1])
        {
            k--;
        }

        j++;
        k--;
        
            }
       }
       
       }
     return list; 

   /*   int n = nums.length;
        Arrays.sort(nums);  // Sorting for two-pointer approach
        
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) { // Ensure at least 3 elements left
            if (i > 0 && nums[i] == nums[i - 1]) { // Skip duplicate elements for i
                continue;
            }

            int j = i + 1;
            int k = n - 1;
            
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    // Found a valid triplet
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    
                    // Move both pointers to next unique values
                    j++;
                    k--;

                    // **Skip all duplicate elements for j**
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // **Skip all duplicate elements for k**
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return list;  */
          }
}