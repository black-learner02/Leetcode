class Solution {
    public String sortSentence(String s) {

     /*   String[] arr = s.split(" ");

       String[] res = new String[arr.length];
        
         for(int i=0;i<arr.length;i++)
         {
            int temp = arr[i].charAt(arr[i].length()-1)-'0';
             res[temp-1]=arr[i];
         }
         
       StringBuilder sb = new StringBuilder();

         for(int i=0;i<res.length;i++)
         {
            if(i==res.length-1)
            {
                 sb.append(res[i].substring(0,res[i].length()-1));
            }
            else
            {

             sb.append(res[i].substring(0,res[i].length()-1)+" ");
            }



         }

        return sb.toString();*/


        String[] str = s.split(" ");                // Since the String contains only whitespaces, it's safe to split the String at them
	String[] res = new String[str.length];      // This String array will hold the rearranged words
	StringBuilder sb = new StringBuilder();     // Instead of using '+' operator to concat repeatedly, I have created a StringBuilder object which is more efficient
	int i = 0;                          
	for (String elem : str) {
		i = (int) (elem.charAt(elem.length() - 1) - '0');  // This  will extract the digit present at the end of each String and store it in i (i = index of the word in res[])
		res[i - 1] = elem.substring(0, elem.length() - 1); // This gives the substring of each String except for the digit in the end and stores the word at an appropriate index (i - 1) in res[]
	}
	//append the words from res[] to StringBuilder object to form a sentence
	for (i = 0; i < res.length - 1; i++)
		sb.append(res[i]).append(" ");
	sb.append(res[i]);
	return sb.toString();
        
    }
}