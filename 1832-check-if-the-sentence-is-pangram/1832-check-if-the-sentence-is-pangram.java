class Solution {
    public boolean checkIfPangram(String sentence) {

        int[] arr = new int[26];

        for(int i=0;i<sentence.length();i++)
        {
             char ch =sentence.charAt(i);

             if(ch!=' ')
             {
                int ind=0;
               if((int)ch>=97)
               {
                   ind=ch-'a';
               }
               else
               {
                  ind=ch-'A';
               }
               arr[ind]++;
             }
        }

     for(int i=0;i<arr.length;i++)
     {
        if(arr[i]==0)
        {
            return false;
        }
     }
      
        return true;
    }
}