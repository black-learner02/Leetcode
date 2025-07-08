class Solution {
    public int numberOfSubstrings(String s) {
        
        int res=0;

        int j=0;

        HashMap<Character,Integer> map = new HashMap<>();
       

        while(j<s.length())
        {
            char ch=s.charAt(j);
            map.put(ch,j);

            if(map.size()==3)
            {
            int i=Integer.MAX_VALUE;
            i=Math.min(i,map.get('a'));
            i=Math.min(i,map.get('b'));
            i=Math.min(i,map.get('c'));

                res=res+(i-0+1);
            }
            j++;
        }
        return res;
    }
}