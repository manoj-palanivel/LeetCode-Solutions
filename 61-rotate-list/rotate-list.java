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

    public int len(ListNode bead){
        int count = 0;
        while(bead != null){
            bead = bead.next;
            count++;
        }
        return count;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int n = len(head);
        k = k % n;
        if (k == 0) return head;

        // Make the list circular
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head; // circular

        // Find new tail: (n - k)th node
        ListNode newTail = head;
        for (int i = 0; i < n - k - 1; i++) {
            newTail = newTail.next;
        }

        // Set new head
        ListNode newHead = newTail.next;
        newTail.next = null; 

        return newHead;
    }
}




