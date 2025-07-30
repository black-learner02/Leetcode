class Solution {
    public int reverse(int x) {


        return rever(x);

        
    }

    public static int rever(int num)
    {
        int res=0;

        while(num!=0)
        {
            int temp=num%10;
             if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && temp > 7)) {
                return 0; 
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && temp < -8)) {
                return 0; 
            }

            res=res*10+temp;
            num/=10;
        }

        return res;
    }
}