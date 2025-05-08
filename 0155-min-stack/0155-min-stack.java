class MinStack {

    Stack<Long> stack;

    long min=Long.MAX_VALUE;

    public MinStack() {

        stack = new Stack<>();
        
    }
    
    public void push(int val) {

        long v=(long)val;

       if(stack.isEmpty())
       {
        stack.push(v);
        min=v;
       }
       else
       {
        if(val<min)
        {
            stack.push(2L*val-min);
            min=v;
        }
        else
        {
            stack.push(v);
        }
       }
    }
    
    public void pop() {
      
     if(!stack.isEmpty())
     {
        long top=stack.peek();

        if(top<min)
        {
            min=2L*min-top;
        }
        stack.pop();
     }
        
    }
    
    public int top() {

      if(stack.isEmpty())
      {
         return -1;
      }
      long top=stack.peek();

      if(top<min)
      {
        return (int)min;
      }
      return (int)top;
    }
    
    public int getMin() {

        if(stack.isEmpty())
        {
            return -1;
        }     

        return (int)min; 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */