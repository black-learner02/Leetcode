class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        {
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        HashMap<Character,Integer> map1 = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);

        }

  /*      for(int i=0;i<t.length();i++)
        {
           char ch = t.charAt(i);
           if(!map.containsKey(ch) || map.get(ch)==0)
           {
            return false;
           }

           map.put(ch,map.get(ch)-1);
        }*/
        if(map.equals(map1))
       return true;

       return false;
    }
}