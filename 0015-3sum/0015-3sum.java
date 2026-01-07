class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();
        
        int i=0;

        while(i<nums.length-2)
        {
            int j=i+1;
            int k=nums.length-1;

            while(j<k)
            {

            int sum=nums[i]+nums[j]+nums[k];

            if(sum==0)
            {
                 set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                 j++;
            }
            else if(sum<0)
            {
                j++;
            }
            else
            {
                k--;
            }

            }
            i++;
        }

        List<List<Integer>> list = new ArrayList<>(set);

        return list;
        
    }
}