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
    public void flatten(TreeNode root) {
        flattenHelper(root);
    }

    public TreeNode flattenHelper(TreeNode root){
        if(root==null){
            return null;
        }
        //Left Tail and Right Tail
        //Instead of returning the root,, we can return the last node as returning root will be useless.. 
        TreeNode lt = flattenHelper(root.left);
        TreeNode rt = flattenHelper(root.right);

        if(lt==null && rt==null){
            return root;
        }
        else if(lt==null && rt!=null){
            return rt;
        }
        else if(lt!=null && rt==null){
            TreeNode lc = root.left;
            root.right = lc;
            root.left = null;
            return lt;
        }
        else{
            TreeNode lc = root.left;
            TreeNode rc = root.right;
            root.right = lc;
            root.left = null;
            lt.right = rc;
            return rt;
        }
    }
}