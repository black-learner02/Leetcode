class Solution {
    public boolean isAnagram(String s, String t) {

    //     if(s.length()!=t.length())
    //     {
    //         return false;
    //     }

    //     HashMap<Character,Integer> map = new HashMap<>();

    //     for(int i=0;i<s.length();i++)
    //     {
    //         map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    //     }

    //     for(int i=0;i<t.length();i++)
    //     {
    //        char ch = t.charAt(i);
    //        if(!map.containsKey(ch) || map.get(ch)==0)
    //        {
    //         return false;
    //        }

    //        map.put(ch,map.get(ch)-1);
    //     }
    //    return true;

    if (s.length() != t.length()) return false;

    int[] count = new int[26];

    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }

    for (int c : count) {
        if (c != 0) return false;
    }

    return true;
 }

}