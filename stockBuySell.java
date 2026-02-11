class stockBuySell{
    public int maxProfit(int[] prices) {
        int profit = 0;
        int Buy_Price = prices[0];
        int n = prices.length;
        for(int i = 0 ; i<n;i++){
            if(Buy_Price>prices[i]){
                Buy_Price=prices[i];
            }
            else if(profit<prices[i]-Buy_Price){
                profit = prices[i] - Buy_Price;
            }
        }
        return profit;
    }
}