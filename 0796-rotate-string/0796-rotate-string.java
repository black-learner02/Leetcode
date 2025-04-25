class Solution {
    public boolean rotateString(String s, String goal) {

        String temp=s+s;

        for(int i=0;i<s.length();i++)
        {

            String ran=temp.substring(i,i+s.length());
            
               if(ran.equals(goal))
               {
                return true;
               }

                
            }

        return false;
        
    }
}