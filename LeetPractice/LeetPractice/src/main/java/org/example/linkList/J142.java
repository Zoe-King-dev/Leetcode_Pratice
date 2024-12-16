package org.example.linkList;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 16 22 51
 **/
public class J142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        Integer flag = 0;
        if(head == null || head.next == null)
            return null;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
