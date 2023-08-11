class Solution {
    public int change(int amt, int[] coins) 
    {
        int [] dp = new int[amt+1];
        dp[0] = 1;
        int coin;
        for(int j = 0;j<coins.length;j++)
        {
            for(int i = coins[j];i<=amt;i++)
            {
            coin = coins[j];
            dp[i]= (dp[i]+dp[i-coin]);
             }
        }
        return dp[amt];
    }
    }