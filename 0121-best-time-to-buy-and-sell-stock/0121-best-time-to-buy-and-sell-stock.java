class Solution {
    public int maxProfit(int[] prices)
    {
        int min_price=prices[0],profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(min_price>prices[i])
            {
                min_price=prices[i];
            }
            else
            {
                int res=prices[i]-min_price;
                profit=Math.max(res,profit);
            }
        }
        return profit;
    }
}