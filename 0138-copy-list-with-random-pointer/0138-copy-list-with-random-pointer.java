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
        if(head==null){
            return null;
        }
        //Insertion
        Node temp = head;
        while(temp!=null){
            Node n = new Node(temp.val);
            Node tempp1 = temp.next;
            temp.next = n;
            n.next = tempp1;
            temp = tempp1;
        }

        //Random Pointer assignment to the Clone List
        temp = head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        //Separate the LinkedLists
        Node newHead = head.next;
        Node temp1 = head;
        Node temp2 = head.next;
        while(temp1!=null){
            Node temp1p1 = temp1.next.next;
            Node temp2p1 = null;
            if(temp2.next!=null){
                temp2p1 = temp2.next.next;
            }
            temp1.next = temp1p1;
            temp2.next = temp2p1;
            temp1 = temp1p1;
            temp2 = temp2p1;
        }

        return newHead;
    }
}