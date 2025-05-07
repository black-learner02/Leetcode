class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
            }
            else
            {
              if(stack.isEmpty())
              {
                return false;
              }

              int temp=(int)stack.peek();

              if(!(temp+2==(int)c || temp+1==(int)c))
              {
                return false;
              }
              stack.pop();
                
            }
            
        }

       if(!stack.isEmpty())
       {
        return false;
       }
       return true;
        
    }
}