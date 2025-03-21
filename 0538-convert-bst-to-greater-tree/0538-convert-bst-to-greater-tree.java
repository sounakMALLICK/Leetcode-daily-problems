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
    public TreeNode convertBST(TreeNode root) {
        inorderReverse(root);
        return root;
    }
    int sum = 0;
    public void inorderReverse(TreeNode root){
        if(root==null){
            return;
        }
        inorderReverse(root.right);
        sum += root.val;
        root.val = sum;
        inorderReverse(root.left);
    }
}