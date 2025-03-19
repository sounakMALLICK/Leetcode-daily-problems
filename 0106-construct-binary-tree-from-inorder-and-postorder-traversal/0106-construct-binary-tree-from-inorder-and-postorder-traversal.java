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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return buildTreeHelper(inorder, 0, n-1, postorder, 0, n-1);
    }
    public TreeNode buildTreeHelper(int[] inorder, int is, int ie, int[] postorder, int ps, int pe) {
        if(is>ie || ps>pe){
            return null;
        }
        TreeNode root = new TreeNode(postorder[pe]);
        int idx = -1;
        for(int i=is; i<=ie; i++){
            if(postorder[pe] == inorder[i]){
                idx = i;
                break;
            }
        }
        int count = idx-is;

        root.left = buildTreeHelper(inorder, is, idx-1, postorder, ps, ps+count-1);
        root.right = buildTreeHelper(inorder, idx+1, ie, postorder, ps+count, pe-1);

        return root;
    }
}