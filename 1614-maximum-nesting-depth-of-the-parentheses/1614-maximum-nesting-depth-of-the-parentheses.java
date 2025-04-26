class Solution {
    public int maxDepth(String s) {
 
     int max=0;
     int count=0;

     for(int i=0;i<s.length();i++)
     {
       char ch=s.charAt(i);

       if(ch=='(' &&  count>=0)
       {
        count++;
        max=Math.max(max,count);
       }

       if(ch==')' && count>0)
       {
        count--;
       }
     }
 
    return max;

    }
}