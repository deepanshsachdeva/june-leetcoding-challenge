/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans;
    
    public int sumNumbers(TreeNode root) {
        ans = 0;
        
        if(root == null)
            return ans;
        
        dfs(root,0);
        
        return ans;
    }
    
    private void dfs(TreeNode root, int val){
        if(root == null)
            return;
        
        val *= 10;
        val += root.val;
        
        if(root.left == null && root.right == null){
            ans += val;
            return;
        }
        
        dfs(root.left, val);
        dfs(root.right, val);
    }
}
