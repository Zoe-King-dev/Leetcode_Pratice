package org.example.linkList;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 15 18 14
 **/
public class J141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow, fast;

        if (head == null || head.next == null)
            return false;

        slow = head;
        fast = head.next;

        while(slow != fast){
            if(fast.next == null || fast.next.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;

    }
}
