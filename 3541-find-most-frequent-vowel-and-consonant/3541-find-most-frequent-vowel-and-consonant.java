class Solution {
    public int maxFreqSum(String s) {

        int[] arr = new int[26];

        for(int i=0;i<s.length();i++)
        {
            int ind=s.charAt(i)-'a';
            arr[ind]++;
        }

        int vMax=0;
        int cMax=0;

        for(int i=0;i<arr.length;i++)
        {
            char ch = (char)(i+'a');

            if(ch=='a' ||ch=='e'|| ch=='i' || ch=='o' || ch=='u')
            {
                if(arr[i]>vMax)
                {
                    vMax=arr[i];
                }
            }
            else
            {
                if(arr[i]>cMax)
                {
                    cMax=arr[i];
                }
            }

        }

       
        return vMax+cMax;
    }
}