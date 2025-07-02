class Solution {
    public int totalFruit(int[] fruits) {

    int res=0;
    int i=0;
    int j=0;

    HashMap<Integer,Integer> map = new HashMap<>();

    while(j<fruits.length)
    {

       if(map.containsKey(fruits[j]))
       {
          map.put(fruits[j],j);
       }
       else
       {
         if(map.size()==2)
         {
            while(fruits[i]==fruits[j-1])
            {
                i++;
            }
            i=map.get(fruits[i])+1;
            int temp=map.get(fruits[i]);
            map.clear();
            map.put(fruits[j],j);
            map.put(fruits[i],temp);
         }
         else
         {
            map.put(fruits[j],j);
         }
       }

        res=Math.max(res,j-i+1);

       j++;
    

    } 

        return res;
    }
}