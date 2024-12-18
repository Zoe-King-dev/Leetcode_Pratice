package org.example.linkList;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 15 18 14
 **/
public class J141 {
    public boolean hasCycle(ListNode head) {
        // Check if the list is empty or has only one node
        if (head == null || head.next == null) return false;

        // Initialize slow and fast pointers
        ListNode slow = head, fast = head.next;

        // Traverse the list with two pointers
        while (slow != fast) {
            if (fast.next == null || fast.next.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Return true if a cycle is detected
        return true;
    }
}

