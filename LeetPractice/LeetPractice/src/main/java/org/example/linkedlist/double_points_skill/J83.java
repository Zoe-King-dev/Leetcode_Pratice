package org.example.linkedlist.double_points_skill;

import org.example.linkedlist.ListNode;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 24 15 44
 **/
public class J83 {
    public ListNode deleteDuplicates(ListNode head) {
        // Be careful to null situation
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head, fast = head.next;
        while(fast != null){
            if(slow.val != fast.val){
                slow = slow.next;
                slow.val = fast.val;
            }
            fast = fast.next;
        }
        // Be careful to cut the rest linkedList when meet the last repeated number
        slow.next = null;
        return head;
    }
}
