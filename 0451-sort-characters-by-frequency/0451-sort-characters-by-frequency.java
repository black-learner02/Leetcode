class Solution {
    public String frequencySort(String s) {

         HashMap<Character,Integer> map = new HashMap<>();

         StringBuilder res=new StringBuilder();

         for(int i=0;i<s.length();i++)
         {
            char ch =s.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
         }

         List<Map.Entry<Character,Integer>> list = new ArrayList(map.entrySet());

         list.sort((a,b)->b.getValue().compareTo(a.getValue()));

         for(Map.Entry<Character,Integer> entry : list)
         {
            int end=entry.getValue();

            for(int i=0;i<end;i++)
            {
                res.append(entry.getKey());
            }
         }

         return res.toString();
        
    }
}