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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode itr1 = list1;
        ListNode itr2 = list2;
        ListNode result = null;
        ListNode head = null;

        if(list1 == null) {
            return list2;
        }

        if(list2 == null) {
            return list1;
        }

        while(itr1 != null && itr2 != null) {
            ListNode nextVal = null;
            if (itr1.val < itr2.val) {
                nextVal = itr1;
                itr1 = itr1.next;
            } else {
                nextVal = itr2;
                itr2 = itr2.next;
            }

            if(head == null) {
                head = nextVal;
                result = nextVal;
            } else {
                result.next = nextVal;
                result = result.next;
            }
            
        }

        if(itr1 == null) {
            result.next = itr2;
        } else {
            result.next = itr1;
        }

        return head;
    }
}