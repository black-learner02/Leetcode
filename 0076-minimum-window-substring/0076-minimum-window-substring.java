class Solution {
    public String minWindow(String s, String t) {

     
     int i=0;
     int j=0;

     int stIndx=0;

     int count=0;

     int minlen=Integer.MAX_VALUE;


     HashMap<Character,Integer> map = new HashMap<>();

     for(int k=0;k<t.length();k++)
     {
        map.put(t.charAt(k),map.getOrDefault(t.charAt(k),0)+1);
     }

     int size=t.length();

     while(j<s.length())
     {
         char ch=s.charAt(j);
          if(map.containsKey(ch))
          {
            map.put(ch,map.get(ch)-1);
          if(map.get(ch)>=0)
          {
            count++;
          }
          }

        while(count==size)
          {
            if(j-i+1<minlen)
            {
                stIndx=i;
                minlen=j-i+1;
            }
           
            if(map.containsKey(s.charAt(i)))
            {
              map.put(s.charAt(i),map.get(s.charAt(i))+1);

            if(map.get(s.charAt(i))>0)
            {
                count--;
            }
            }

            i++;
        }
        j++;

     }
       return minlen==Integer.MAX_VALUE? "" : s.substring(stIndx,stIndx+minlen);
      
    }
}