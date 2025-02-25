/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        Node newNode = new Node(temp.val);
        Node newHead = newNode;
        Node temp2 = newNode;
        temp = temp.next;

        while(temp!=null){
            newNode = new Node(temp.val);
            temp2.next = newNode;
            temp = temp.next;
            temp2 = temp2.next;
        }

        HashMap<Node, Node> map = new HashMap<>();
        temp = head;
        temp2 = newHead;
        while(temp!=null){
            map.put(temp, temp2);
            temp = temp.next;
            temp2 = temp2.next;
        }

        temp = head;
        temp2 = newHead;
        while(temp!=null){
            temp2.random = map.get(temp.random);
            temp = temp.next;
            temp2 = temp2.next;
        }

        return newHead;
    }
}