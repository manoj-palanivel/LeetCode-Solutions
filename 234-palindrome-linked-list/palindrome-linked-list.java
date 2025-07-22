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
    public boolean isPalindrome(ListNode head) {
      ListNode fast = head;
      ListNode slow = head;

      while(fast!=null && fast.next!=null){
        fast = fast.next.next;
        slow = slow.next;
      }

      if(fast!=null){
        slow=slow.next;
      }
      fast = head;
      ListNode prev = null;

      while(slow!=null){
            ListNode upc = slow.next;
            slow.next = prev;
            prev = slow;
            slow = upc;
      }

      while(prev!=null){
        if(fast.val != prev.val){
            return false;
        }
        prev = prev.next;
        fast=fast.next;
      }
      return true;

    }
}