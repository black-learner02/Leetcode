class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

    PriorityQueue<Integer> q = new PriorityQueue<>();

    for(int i=0;i<nums.length;i++)
    {
        q.offer(nums[i]);
    }

    for(int i=0;i<k;i++)
    {
        int temp=q.poll();
        temp*=-1;
        q.offer(temp);
    }

    int sum=0;

    while(!q.isEmpty())
    {
        sum+=q.poll();
    }

    return sum;

    }
}