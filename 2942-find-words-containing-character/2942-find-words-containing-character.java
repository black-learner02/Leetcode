class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<words.length;i++)
        {
            if(find(words[i],x))
            {
                list.add(i);
            }
        }
        return list;
    }
    public static boolean find(String s,char x)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==x)
            {
                return true;
            }
        }
        return false;
    }
}