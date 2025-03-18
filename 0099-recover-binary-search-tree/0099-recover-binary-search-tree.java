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

    TreeNode ansNode1=null, ansNode2=null;
    TreeNode prev=null;

    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = ansNode1.val;
        ansNode1.val = ansNode2.val;
        ansNode2.val = temp;
    }
    public void inorder(TreeNode curr){
        if(curr==null){
            return;
        }
        inorder(curr.left);
        if(prev!=null && prev.val>curr.val && ansNode1==null){
            ansNode1 = prev;
            ansNode2 = curr;
        }
        else if(prev!=null && prev.val>curr.val && ansNode1!=null){
            ansNode2 = curr;
        }
        prev=curr;
        inorder(curr.right);
    }
}