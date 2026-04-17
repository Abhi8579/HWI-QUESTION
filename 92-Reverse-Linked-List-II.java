/*
Problem: Reverse Linked List II
LeetCode: 92
Language: Java
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        // Step 1: Move prev to node before left
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;

        // Step 2: Reverse nodes between left and right
        for (int i = 0; i < right - left; i++) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}
