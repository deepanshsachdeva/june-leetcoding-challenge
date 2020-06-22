class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        
        if(n == 1)
            return nums[0];
        
        Arrays.sort(nums);
        
        for(int i=0,j=2; i<n-2; i+=3){
            if(nums[i] != nums[j]){
                return nums[i];
            }
            j+=3;
        }
        
        return nums[n-1];
    }
}
