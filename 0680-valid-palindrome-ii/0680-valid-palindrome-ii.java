class Solution {
    public boolean validPalindrome(String s) {

       int i=0;
       int j=s.length()-1;

       int count=0;
       int count1=0;

       while(i<j)
       {
          if(s.charAt(i)!=s.charAt(j))
          {
            if(count==0)
            {
            count++;
            i++;
            continue;
            }
            else
            {
                count++;
            }
          }

          i++;
          j--;
       }
       
       i=0;
       j=s.length()-1;
       while(i<j)
       {
          if(s.charAt(i)!=s.charAt(j))
          {
            if(count1==0)
            {
            count1++;
            j--;
            continue;
            }
            else
            {
                count1++;
            }
          }

          i++;
          j--;
       }

      if(count<=1 || count1<=1)
      {
        return true;
      }

      return false;

    }
}