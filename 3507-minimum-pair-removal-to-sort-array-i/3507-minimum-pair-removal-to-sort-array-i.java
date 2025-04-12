class Solution {
    public int minimumPairRemoval(int[] nums) {


        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
       
        int count=0;

        while(!check(list))
        {
            int a=-1;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<list.size()-1;i++)
            {
                int sum=list.get(i)+list.get(i+1);
                if(sum<min)
                {
                   a=i;
                   min=sum;
                }
            }
              count++;
              
            list.remove(a+1);
            list.set(a,min);
          
        }
        return count;

    }
    public static boolean check(ArrayList<Integer> list)
    {
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)<list.get(i-1))
            {
                return false;
            }
        }
        return true;
    }
}
