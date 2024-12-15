package org.example.linkList;

/**
 * @Author Haoran_Yang
 * @Date 2024 10 20 10 04
 **/
public class J1290 {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while(head != null){
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
    }
}
