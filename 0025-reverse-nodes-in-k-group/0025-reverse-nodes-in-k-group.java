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
    public ListNode reverseKGroup(ListNode head, int k) {
        int i = 0;
        ListNode curr = head;
        ListNode first = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while(curr != null){
            i++;
            curr = curr.next;
            if(i == k){
                i = 0;
                ListNode newHead = reverse(first, curr);
                prev.next = newHead;
                prev = first;
                first = curr;
            }
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode head, ListNode end){
        ListNode prev = end;
        while(head != end){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}