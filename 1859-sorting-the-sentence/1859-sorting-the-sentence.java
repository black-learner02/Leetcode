class Solution {
    public String sortSentence(String s) {

       String[] arr = s.split(" ");

       String[] res = new String[arr.length];
        
         for(int i=0;i<arr.length;i++)
         {
            int temp = arr[i].charAt(arr[i].length()-1)-'0';
             res[temp-1]=arr[i].substring(0,arr[i].length()-1);
         }
         
       StringBuilder sb = new StringBuilder();

         for(int i=0;i<res.length;i++)
         {
            if(i==res.length-1)
            {
                 sb.append(res[i]);
            }
            else
            {

             sb.append(res[i]+" ");
            }



         }

        return sb.toString();


 
    }
}