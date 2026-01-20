class Solution {
    public String longestPalindrome(String s) {

      int start=0;
      int end=0;
      
      for(int i=0;i<s.length();i++)
      {
         int oddlen=isPalindrom(s,i,i);

         int evenlen=isPalindrom(s,i,i+1);

         int maxlen=Math.max(evenlen,oddlen);

        if (maxlen > end - start) {
                start = i - (maxlen-1) / 2;
                end = i + maxlen / 2;
            }
      }
       
       return s.substring(start,end+1);
     }

    public static int isPalindrom(String s,int i,int j)
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