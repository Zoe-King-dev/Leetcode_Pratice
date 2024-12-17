package org.example.linkList;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 17 20 02
 **/
public class J876 {

    /*
    *** Note ***:
       while(fast != null && fast.next != null)中两个条件有先后执行顺序，有可能报异常的放在后面，先判断不会报异常的条件
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
