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
        int length = 0;
        ListNode cPtr = head;
        while(cPtr != null) {
            cPtr = cPtr.next;
            length++;
        }

        ListNode result = head;
        int itr = 0;
        ListNode prev = null;

        while(itr <= length/2) {
            ListNode nxt = result.next;
            result.next = prev;
            prev = result;
            result = nxt;
            itr++;
        }

        head = prev;

        if(length % 2 == 0) {
            prev = prev.next;   
        }

        while(prev.next != null) {
            ListNode cNode = prev.next;
            ListNode nNode = result.next;
            prev.next = result;
            result.next = cNode;
            result = nNode;
            prev = cNode;
        }

        prev = null;
        while(head != null) {
            ListNode nNode = head.next;
            head.next = prev;
            prev = head;
            head = nNode;
        }

        System.out.println(prev.val);
    }
}
