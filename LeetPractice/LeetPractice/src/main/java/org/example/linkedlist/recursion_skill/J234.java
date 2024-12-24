package org.example.linkedlist.recursion_skill;

import org.example.linkedlist.ListNode;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 21 22 38
 **/
public class J234 {
    // Try to reverse whole list is unfeasible, because reverse will change the original LinkedList so that
    // you cannot compare the reversed list with original list(original list doesn't exist).

    // So, FIND the middle point and reverse the second half list is some feasible way.
    public boolean isPalindrome(ListNode head) {
        ListNode middle = middlePoint(head);

        ListNode tail = reverseLinkedList(middle);

        ListNode p1 = head, p2 = tail;
        while(p2 != null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public ListNode reverseLinkedList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null, cur = head, nxt = head.next;
        while (cur != null){
            //the pointer reverse completed in next iteration
            cur.next = pre;
            pre = cur;
            cur = nxt;
            if (nxt != null){
                nxt = nxt.next;
            }
        }
        return pre;
    }

    public ListNode middlePoint(ListNode head){
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }

}
