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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return buildTreeHelper(preorder, 0, n-1, inorder, 0, n-1);
    }

    public TreeNode buildTreeHelper(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
        if(ps>pe || is>ie){
            return null;
        }
        TreeNode root = new TreeNode(preorder[ps]);
        int idx=0;
        for(int i=is; i<=ie; i++){
            if(preorder[ps] == inorder[i]){
                idx = i;
                break;
            }
        }
        int count = idx-is;

        root.left = buildTreeHelper(preorder, ps+1, ps+count, inorder, is, idx-1);
        root.right = buildTreeHelper(preorder, ps+count+1, pe, inorder, idx+1, ie);

        return root;
    }
}