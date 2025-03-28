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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            if(root.val==targetSum){
                return true;
            }
            return false;
        }
        boolean l = hasPathSum(root.left, targetSum-root.val);
        boolean r = hasPathSum(root.right, targetSum-root.val);

        if(l==true || r==true){
            return true;
        }
        return false;
    }
}