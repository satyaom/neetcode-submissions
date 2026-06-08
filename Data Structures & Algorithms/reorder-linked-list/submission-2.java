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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode cNode = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(cNode != null) {
            ListNode nNode = cNode.next;
            cNode.next = prev;
            prev = cNode;
            cNode = nNode;
        }

        ListNode pNode = head;
        cNode = prev;
        while(cNode != null) {
            ListNode nPnode = pNode.next;
            ListNode nNode = cNode.next;
            pNode.next = cNode;
            cNode.next = nPnode;
            pNode = nPnode;
            cNode = nNode;
        }
    }
}
