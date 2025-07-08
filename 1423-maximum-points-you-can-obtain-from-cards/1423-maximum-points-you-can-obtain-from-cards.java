class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int lsum=0;
        int rsum=0;

        int res=0;

        for(int i=0;i<k;i++)
        {
            lsum+=cardPoints[i];
        }
        int pos=k-1;

        res=lsum;

        for(int i=cardPoints.length-1;i>=cardPoints.length-k;i--)
        {
            rsum+=cardPoints[i];
            lsum-=cardPoints[pos];
            pos--;
            res=Math.max(res,lsum+rsum);
        }

        return res;
                
    }
}