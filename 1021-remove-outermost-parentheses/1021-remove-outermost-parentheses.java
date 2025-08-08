class Solution {
    public String removeOuterParentheses(String s) {
     
     StringBuilder res = new StringBuilder();
      int temp=0;

      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);

        if(ch=='(' && temp++ > 0)
        {
            res.append(ch);
          
        }

        if(ch==')'&& temp-- > 1)
        {
            res.append(ch);
          
        }
      } 

      return res.toString();
        
    }
}