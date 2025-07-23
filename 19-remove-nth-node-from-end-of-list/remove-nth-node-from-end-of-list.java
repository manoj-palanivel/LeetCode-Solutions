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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        ListNode cr = dummy;
        
        while(n>0){
            curr = curr.next;
            n--;
        }
        while(curr.next !=null){
            curr = curr.next;
            cr = cr.next;
        }

        ListNode temp = cr.next;
        cr.next = cr.next.next;
        temp.next = null;

        return dummy.next;

    }
}