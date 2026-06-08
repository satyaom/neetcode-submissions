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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode itr = head;
        while(itr != null) {
            ListNode curI = itr.next;
            itr.next = prev;
            prev = itr;
            itr = curI;
        }
        return prev;
    }
}
