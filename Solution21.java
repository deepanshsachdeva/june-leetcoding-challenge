class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length;
        int m = dungeon[0].length;
        
        int[][] hp = new int[n][m];
        
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                if (i+1 == n && j+1 == m) {
                    hp[i][j] = Math.max(1 - dungeon[i][j], 1);
                    continue;
                }
                
                if (i+1 == n) {
                    hp[i][j] = Math.max(hp[i][j + 1] - dungeon[i][j], 1);
                } else if (j + 1 == m) {
                    hp[i][j] = Math.max(hp[i + 1][j] - dungeon[i][j], 1);
                } else {
                    int right = Math.max(hp[i][j + 1] - dungeon[i][j], 1);
                    int down = Math.max(hp[i + 1][j] - dungeon[i][j], 1);
                    hp[i][j] = Math.min(right, down);
                }
            }
        }
        
        return hp[0][0];
    }
}
