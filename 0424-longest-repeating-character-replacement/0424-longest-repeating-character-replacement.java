class Solution {
    public int characterReplacement(String s, int k) {

        int res=0;

        int i=0;
        int j=0;
        int count=0;
        char tar=s.charAt(j);

        HashMap<Character,Integer> map = new HashMap<>();

        while(j<s.length())
        {
           if(s.charAt(j)!=tar)
           {
            count++;
           }
           while(count>k)
           {
              if(tar!=s.charAt(i))
              {
                  count=count-map.get(s.charAt(i));
                  tar=s.charAt(i);
              }
              else
              {
              i++;
              }
           }
          map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);

           res=Math.max(res,j-i+1);
           j++;

        }

        return res;
    }
}