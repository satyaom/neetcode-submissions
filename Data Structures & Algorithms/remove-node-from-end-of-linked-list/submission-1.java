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
        if(head.next == null) {
            return null;
        }
        ListNode cNode = head;
        while(n > 0) {
            cNode = cNode.next;
            n--;
        }

        ListNode pNode = head;
        ListNode prev = null;
        while(cNode!= null) {
            prev = pNode;
            cNode = cNode.next;
            pNode = pNode.next;
        }

        if(prev == null) {
            head = head.next;
        } else {
            prev.next = prev.next.next;
        }
        return head;
    }
}
