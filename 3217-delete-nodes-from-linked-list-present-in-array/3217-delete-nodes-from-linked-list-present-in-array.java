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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        while(head!=null && set.contains(head.val)){
            head = head.next;
        }
        if(head==null){
            return null;
        }
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            ListNode tempp1 = temp.next;
            while(tempp1!=null && set.contains(tempp1.val)){
                temp.next = tempp1.next;
                tempp1 = tempp1.next;
            }
            temp = temp.next;
        }
        return head;
    }
}