class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<words.length;i++)
        {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

        PriorityQueue<String> q = new PriorityQueue<>((a,b)->{

            int freq=map.get(b)-map.get(a);

            if(freq==0)
            {
                return a.compareTo(b);
            }
            
            return freq;
        });

        q.addAll(map.keySet());

        List<String> res = new ArrayList<>();

        while(k>0)
        {
            res.add(q.poll());
            k--;
        }

        
        return res;
    }
}