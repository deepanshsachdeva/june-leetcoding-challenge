class Solution {
    public int change(int amount, int[] coins) {
        if (coins.length == 0 && amount == 0) return 1;
        
        if (coins == null || coins.length == 0) return 0;
        
        int[][] dp = new int[coins.length+1][amount+1];
        
        for(int i=0; i<=coins.length; i++){
            dp[i][0] = 1;
        }
        
        for(int i=1; i<=amount; i++){
            dp[0][i] = 0;
        }
        
        for(int ci=1; ci<=coins.length; ci++){
            int coin = coins[ci-1];
            
            for (int total=1; total<=amount; total++) {
                dp[ci][total] = dp[ci-1][total] + ((coin>total) ? 0 : dp[ci][total-coin]); 
            }
        }
        
        return dp[coins.length][amount];
    }
}
