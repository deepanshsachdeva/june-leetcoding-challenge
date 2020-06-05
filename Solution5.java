class Solution {
    
    private int[] wts;
    private int total;
    
    public Solution(int[] w) {
        total = 0;
        wts = new int[w.length];
        
        for(int i=0; i<w.length; i++){
            total += w[i];
            wts[i] = total;
        }
    }
    
    public int pickIndex() {
        double r = Math.random()*total;
        
        int low = 0;
        int high = wts.length-1;
        
        while(low<high){
            int mid = low + (high-low)/2;
            
            if(r > wts[mid]){
                low = mid+1;
            }else{
                high = mid;
            }
            
        }
        
        return low;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
