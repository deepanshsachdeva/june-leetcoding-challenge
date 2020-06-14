class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        if(nums.length == 0) 
            return ans;
        
        int[] dp = new int[nums.length];
        int max = 0;
        
        Arrays.sort(nums);
        
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i]%nums[j] == 0 && 1+dp[j] > dp[i]) {
                    dp[i] = 1+dp[j];
                    
                    if(max < dp[i])
                        max = dp[i];
                }
            }
        }
        
        int temp = -1;
        
        for(int i=nums.length-1; i>=0; i--){
            if(dp[i] == max && (temp == -1 || temp%nums[i] == 0)){
                ans.add(nums[i]);
                max--;
                temp = nums[i];
            }
        }
        
        return ans;
    }
}
