package org.example.linkedlist.recursion_skill;

import org.example.linkedlist.ListNode;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 18 15 36
 **/
public class J206 {
    public ListNode reverseList(ListNode head) {
        // Iteration Method
        /*ListNode pre = null, cur = head, nxt = cur.next;

        // null situation
        if (head == null || head.next == null)
            return head;

        // Iteration
        while (cur != null){
            cur.next = pre;
            pre = cur;
            cur = nxt;
            // ***IMP***: Do not use next in IF judge
            if(nxt != null) {
                nxt = nxt.next;
            }
        }
        return pre;*/

        // Recursion Method
        //
        if(head == null || head.next == null){
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

}
