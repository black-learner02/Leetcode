class Solution {
    public String longestCommonPrefix(String[] strs) {

	
		String res=strs[0];
		
		for(int i=1;i<strs.length;i++)
		{
			String temp=strs[i];
			
			res=find(temp,res);
			
		}
		
       return res;

	}
	
	public static String find(String s1,String s2)
	{
		int i=0;
        int j=0;

        while(i<s1.length() && j<s2.length())
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                break;
            }
        }
         return s1.substring(0,j);
	}
}