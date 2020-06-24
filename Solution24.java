class Solution {
    public int numTrees(int n) {
        return catalan(n);
    }
    
    private int catalan(int n) {
        int[] catalans = new int[n+1];
        catalans[0] = 1;
        catalans[1] = 1;
        
        for(int i=2; i<=n; i++){
            catalans[i] = 0;
            
            for(int j=0; j<i; j++){
                catalans[i] += catalans[j]*catalans[i-j-1];
            }
        }
        
        return catalans[n];
    }
}
