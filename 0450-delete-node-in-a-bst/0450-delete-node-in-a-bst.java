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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val>key){
            root.left = deleteNode(root.left, key);
        }
        else if(root.val<key){
            root.right = deleteNode(root.right, key);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left!=null && root.right==null){
                return root.left;
            }
            else if(root.left==null && root.right!=null){
                return root.right;
            }
            else{
                int max = rightMost(root.left);
                root.val = max;
                root.left = deleteNode(root.left, max);
                return root;
            }
        }
        return root;
    }
    public int rightMost(TreeNode root){
        while(root.right!=null){
            root = root.right;
        }
        return root.val;
    }
}