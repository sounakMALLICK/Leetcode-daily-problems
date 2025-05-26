/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode revHead = reverse(head);
        if(n==1){
            revHead = revHead.next;
        }
        else{
            int i=1;
            ListNode temp = revHead;
            while(i+1!=n){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        head = reverse(revHead);
        return head;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode currp1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currp1;
        }
        return prev;
    }
}