class Solution {
    public String largestNumber(int[] nums) {

        if(nums.length==0)
        {
            return "";
        }

        String[] arr = new String[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            arr[i]=String.valueOf(nums[i]);
        }

        Comparator<String> comp = new Comparator<String>()
        {
         @Override
          public int compare(String s1,String s2)
          {
            String st1=s1+s2;
            String st2=s2+s1;
            return st2.compareTo(st1);
          }
        };

        Arrays.sort(arr,comp);

         

        if(arr[0].equals("0"))
        {
            return "0";
        }

       StringBuilder s = new StringBuilder();

        for(String temp: arr)
        {
            s.append(temp);
        }
        
        return s.toString();
    }
}