class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<buy)
                buy=prices[i];
            if(prices[i]>buy)
            {
                int curr_profit=prices[i]-buy;
                profit=Math.max(curr_profit, profit);
            }
        }
        return profit;
    }
}