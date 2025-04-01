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
    public List<Integer> preorderTraversal(TreeNode root) {
        // Morris traversal
        // T.C:O(N) , S.C:O(1)
        // List<Integer> is an output which will not be count in Space

        TreeNode curr = root;
        List<Integer> ans = new ArrayList<>();
        while(curr!=null){
            if(curr.left==null){
                ans.add(curr.val);
                curr = curr.right;
            }
            else{
                TreeNode currp1 = curr.left;
                while(currp1.right!=null && currp1.right!=curr){
                    currp1 = currp1.right;
                }
                if(currp1.right==null){
                    currp1.right = curr;
                    ans.add(curr.val);
                    curr = curr.left;
                }
                else{
                    currp1.right = null;
                    curr = curr.right;
                }
            }
        }
        return ans;
    }
}