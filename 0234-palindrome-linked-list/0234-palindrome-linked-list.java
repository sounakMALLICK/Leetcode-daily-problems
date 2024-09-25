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
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode currP1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currP1;
        }
        ListNode temp = head;
        while(temp!=null){
            if(temp.val != prev.val){
                return false;
            }
            temp = temp.next;
            prev = prev.next;
        }
        return true;
    }
}