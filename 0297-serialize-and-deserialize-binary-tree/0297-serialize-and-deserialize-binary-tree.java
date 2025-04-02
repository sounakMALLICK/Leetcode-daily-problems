/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }
    public void serializeHelper(TreeNode root, StringBuilder sb){
        //preorder traversal..
        if(root==null){
            sb.append("# ");
            return;
        }
        sb.append(root.val+" ");
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }
    // Decodes your encoded data to tree.
    int i;
    public TreeNode deserialize(String data) {
        String s[] = data.split(" ");
        i=0;
        return deserializeHelper(s);
    }
    public TreeNode deserializeHelper(String s[]){
    if(s[i].equals("#")){
            i++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(s[i]));
        i++;
        root.left = deserializeHelper(s);
        root.right = deserializeHelper(s);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));