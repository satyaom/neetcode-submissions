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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        ListNode sPtr = head;
        ListNode fPtr = head.next.next;
        while(fPtr != null && fPtr.next != null) {
            if(sPtr == fPtr) {
                return true;
            }
            sPtr = sPtr.next;
            fPtr = fPtr.next.next;
        }
        return false;
    }
}
