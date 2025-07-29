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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode curr = ans;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = new ListNode(l1.val);
                l1 = l1.next;
            } else if (l2.val < l1.val) {
                curr.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                curr.next = new ListNode(l1.val);
                curr = curr.next;
                curr.next = new ListNode(l2.val);
                l1 = l1.next;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        // Add remaining nodes
        while (l1 != null) {
            curr.next = new ListNode(l1.val);
            l1 = l1.next;
            curr = curr.next;
        }

        while (l2 != null) {
            curr.next = new ListNode(l2.val);
            l2 = l2.next;
            curr = curr.next;
        }

        return ans.next;
    }
}
