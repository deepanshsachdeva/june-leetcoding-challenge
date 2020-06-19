class Solution {
    public int hIndex(int[] citations) {
        int N = citations.length;
        
        if(N == 1) return 1;
        
        int h_index = 0;
        
        for(int i=N-1; i>=0; i--){
            if(N-i >= citations[i]){
                h_index = citations[i];
                break;
            }
        }
        
        return h_index;
    }
}
