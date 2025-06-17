class StockSpanner {

    List<Integer> list = new ArrayList<>();

    public StockSpanner() {

       
        
    }
    
    public int next(int price) {

        list.add(price);

        int count=1;

        for(int i=list.size()-2;i>=0;i--)
        {
            if(price>=list.get(i))
            {
                count++;
            }
            else
            {
                break;
            }
        }

        return count;
        
    }
}
                  
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */