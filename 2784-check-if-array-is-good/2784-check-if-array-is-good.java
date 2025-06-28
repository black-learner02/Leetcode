class Solution {
    public boolean isGood(int[] nums) {

        Arrays.sort(nums);

        int[] arr = new int[nums.length];

        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=i+1;
        }
        arr[arr.length-1]=arr.length-1;

        return Arrays.equals(nums,arr);
    }
}