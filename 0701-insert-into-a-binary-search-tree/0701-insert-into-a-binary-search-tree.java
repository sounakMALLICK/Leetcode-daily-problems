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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode n = new TreeNode(val);
        if(root==null){
            return n;
        }
        TreeNode ans = root;
        while(true){
            if(root.val>val){
                //left sub tree..
                if(root.left==null){
                    root.left = n;
                    return ans;
                }
                else{
                    root = root.left;
                }
            }
            else{
                //right sub tree..
                if(root.right==null){
                    root.right = n;
                    return ans;
                }
                else{
                    root = root.right;
                }
            }
        }
    }
}