package org.example.linkList;

public class J142 {
    public ListNode detectCycle(ListNode head) {
        // Initialize slow and fast pointers
        ListNode slow = head, fast = head;
        int flag = 0;

        // Detect cycle using two pointers
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = 1;
                break;
            }
        }

        // If cycle is detected, find the starting node
        if (flag == 0) return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
