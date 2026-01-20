class Solution {
    public int countSubstrings(String s) {

    int res=0;
       for(int i=0;i<s.length();i++)
       {
        int oddlen = pal(s,i,i);
        int evenlen = pal(s,i,i+1);

        if(oddlen>1)
        {
            res=res+oddlen/2;
        }

        if(evenlen>=2)
        {
            res=res+evenlen/2;
        }
       }

       res+=s.length();

       return res;
        
    }

    public static int pal(String s,int i,int j)
    {

        while(i>=0 && j<s.length())
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i--;
                j++;
            }
            else
            {
                break;
            }
        }

        return j-i-1;
    }
}