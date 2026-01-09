class Solution {
    public int maxProfit(int[] prices) {

        int proMax=0;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++)
        {
            int temp=prices[i]-min;
            proMax=Math.max(proMax,temp);
            min=Math.min(min,prices[i]);
        }

        return proMax;
        
    }
}