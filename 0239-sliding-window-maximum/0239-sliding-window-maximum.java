class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        
        int[] res = new int[nums.length-k+1];

        int pos=0;

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!dq.isEmpty() && dq.peek()==i-k)
            {
                dq.poll();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
            {
                dq.pollLast();
            }

            dq.offer(i);

            if(i>=k-1)
            {
                res[pos++]= nums[dq.peek()];
            }
        }

      return res;  
    }

    
}