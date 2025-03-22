/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=1; i<=n; i++){
                Node rem = q.remove();
                if(i!=n){
                    rem.next = q.peek();
                }
                if(rem.left!=null){
                    q.add(rem.left);
                    q.add(rem.right);
                }
            }
        }
        return root;
    }
}