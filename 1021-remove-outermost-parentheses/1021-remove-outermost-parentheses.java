class Solution {
    public String removeOuterParentheses(String s) {

      String res="";
      int temp=0;

      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);

        if(ch=='(' && temp++ > 0)
        {
            res+=ch;
          
        }

        if(ch==')'&& temp-- > 1)
        {
            res+=ch;
          
        }
      } 

      return res;
        
    }
}