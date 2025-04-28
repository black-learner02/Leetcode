class Solution {
    public char findTheDifference(String s, String t) {

       HashMap<Character,Integer> map = new HashMap<>();
       char res='0';

       for(char c:s.toCharArray())
       {
        map.put(c,map.getOrDefault(c,0)+1);
       }

       for(char ch:t.toCharArray())
       {
           if(!map.containsKey(ch) || map.get(ch)==0)
           {
            res=ch;
            break;
           }
           else
           {
            map.put(ch,map.get(ch)-1);
           }
       }
       return res;
    }
}