class Solution {
    public int numberOfSubstrings(String s) {
        
        int res=0;

        int j=0;

        int[] lastSeen = {-1,-1,-1};

        while(j<s.length())
        {
            char ch = s.charAt(j);
            lastSeen[ch-'a']=j;

            if(lastSeen[0]!=-1 && lastSeen[0]!=-1 && lastSeen[0]!=-1)
            {
                int min=Math.min(lastSeen[0],lastSeen[1]);
                min=Math.min(min,lastSeen[2]);
                res+=min-0+1;
            }
            j++;
        }
        return res;
    }
}