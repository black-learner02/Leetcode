class Solution {
    public String frequencySort(String s) {

         HashMap<Character,Integer> map = new HashMap<>();

         StringBuilder res=new StringBuilder();

         for(int i=0;i<s.length();i++)
         {
            char ch =s.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
         }

        PriorityQueue<Character> q = new PriorityQueue<>((a,b)->{

            int freq=map.get(b)-map.get(a);
            if(freq==0)
            {
                return (int)a-b;
            }
            return freq;

        });


        q.addAll(map.keySet());

       // StringBuilder res = new StringBuilder();

        while(!q.isEmpty())
        {
            char temp=q.poll();

            for(int i=0;i<map.get(temp);i++)
            {
                res.append(temp);
            }
        }

        return res.toString();
        
    }
}