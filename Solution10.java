class Solution {
    public int searchInsert(int[] nums, int target) {
        int ix = 0;
        
        while(ix<nums.length && nums[ix]<target){
            ix++;
        }
        
        return ix;
    }
}
