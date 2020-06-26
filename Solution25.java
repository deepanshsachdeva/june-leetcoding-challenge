class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int ans = 0;
        
        for(int num : nums){
            counts.put(num, (1+counts.getOrDefault(num,0)));
            
            if(counts.get(num) > 1){
                ans = num;
                break;
            }
        }
        
        return ans;
    }
}
