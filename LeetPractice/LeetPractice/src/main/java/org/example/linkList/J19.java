package org.example.linkList;

/**
 * @Author Haoran_Yang
 * @Date 2024 10 26 15 39
 **/
public class J19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node whose next points to the original head node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode x = findNthFromEnd(dummy, n + 1);
        // Modify the next pointer of x to skip the nth node from the end
        x.next = x.next.next;
        return dummy.next;
    }

    public ListNode findNthFromEnd(ListNode head, int n){
        ListNode p1 = head, p2 = head;
        for(int i = 0; i < n; i ++){
            p1 = p1.next;
        }
        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
