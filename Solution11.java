class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        
        int curr = 0;
        
        while(curr <= r) {
            if (nums[curr] == 0) {
                int temp = nums[curr];
                nums[curr] = nums[l];
                nums[l] = temp;
                
                l++;
                curr++;
                
            } else if (nums[curr] == 2) {
                int temp = nums[curr];
                nums[curr] = nums[r];
                nums[r] = temp;
                
                r--;
            } else{
              curr++;  
            }
        }
    }
}
