package org.example.linkList;

/**
 * @Author Haoran_Yang
 * @Date 2024 10 29 14 58
 **/
public class J86_repratice1 {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = head;
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode smallList = dummy1;
        ListNode bigOrEquList = dummy2;

        while(dummy != null){
            if(dummy.val < x){
                dummy1.next = dummy;
                dummy1 = dummy1.next;
            }
            else{
                dummy2.next = dummy;
                dummy2 = dummy2.next;
            }
            ListNode temp = dummy.next;
            dummy.next = null;
            dummy = temp;
        }
        dummy1.next = bigOrEquList.next;
        ListNode res = smallList.next;
        return res;
    }

}
