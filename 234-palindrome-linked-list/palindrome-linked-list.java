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
        slow=slow.next;
     }

     if(fast!=null){
        slow=slow.next;
     }
     fast = head;

     ListNode curr = slow;
     ListNode temp = null;

     while(curr!=null){
        ListNode upc = curr.next;
        curr.next = temp;
        temp = curr;
        curr = upc;
     }

     while(temp != null){
        if(fast.val != temp.val){
            return false;
        }
        fast=fast.next;
        temp=temp.next;
     }
     return true;
    }
}

 