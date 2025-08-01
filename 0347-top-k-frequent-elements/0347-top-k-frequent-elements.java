class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->{

            int freq=map.get(b)-map.get(a);
            if(freq==0)
            {
                return a-b;
            }
            return freq;
    });

    q.addAll(map.keySet());
    
    int[] arr = new int[k];
    int i=0;

    while(k>0)
    {
        arr[i]=q.poll();
        k--;
        i++;
    }

    return arr;
        
    }
}