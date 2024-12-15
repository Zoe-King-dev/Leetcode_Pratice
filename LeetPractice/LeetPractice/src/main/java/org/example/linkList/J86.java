package org.example.linkList;

/**
 * @Author Haoran_Yang
 * @Date 2024 10 26 12 59
 **/
public class J86 {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyS = new ListNode(-1);
        ListNode dummyB = new ListNode(-1);
        ListNode smaller = dummyS;
        ListNode biggerOrEqu = dummyB;
        ListNode p = head;

        while(p != null){
            if(p.val < x){
                smaller.next = p;
                smaller = smaller.next;
            }else{
                biggerOrEqu.next = p;
                biggerOrEqu = biggerOrEqu.next;
            }
            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }
        smaller.next = dummyB.next;
        ListNode res = dummyS.next;
        return res;
    }
}
