class Solution {
    public int numSquares(int n) {
        if(n == 0) return 0;
        
        if(n == 1) return 1;
        
        int[] dp = new int[n+1];
        Arrays.fill(dp, n+1);
        dp[0] = 0;
        
        //coin change dp
        for(int total=1; total<=n; total++){
            for(int coin = 1; coin*coin <= n; coin++){
                if(coin*coin <= total){
                    dp[total] = Math.min(dp[total-coin*coin]+1 ,dp[total]);
                }
            }
        }
        
        return dp[n];
    }
}
