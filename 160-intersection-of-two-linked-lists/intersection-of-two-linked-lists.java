public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);

        // Move the pointer of the longer list ahead by the length difference
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // Traverse both lists together until the nodes are the same
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA; // or headB (both are same at intersection or null if no intersection)
    }

    // Helper method to calculate the length of a linked list
    private int getListLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}
