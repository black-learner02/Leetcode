class Solution {
    public boolean isPalindrome(int x) {
        int temp,org,sum=0;
        org=x;
        while(x>0)
        {    
            sum=sum*10;
            temp=x%10;
            sum=sum+temp;
            x=x/10;
        }
        if(sum==org)
            return true;
        else
            return false;
    }
}

        