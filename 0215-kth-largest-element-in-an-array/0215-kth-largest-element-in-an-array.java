class Solution  {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);

        for(int i=0;i<nums.length;i++)
        {
            q.add(nums[i]);
        }

        System.out.println(q);
       
          //int prev=0;
          int res=0;

          int temp=k;
          while(temp!=0)
          {
            res=q.poll();
            temp--;
          }
       

     return res;
        
    }

}