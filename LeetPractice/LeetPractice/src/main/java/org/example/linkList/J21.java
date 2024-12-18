package org.example.linkList;

/**
 * @Author Haoran_Yang
 * @Date 2024 10 25 13 21
 **/
public class J21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        ListNode p1 = list1, p2 = list2;

        // Merge the two lists until one of them is exhausted
        while(p1!=null && p2!=null){
            if(p1.val <= p2.val){
                p.next = p1;
                p1 = p1.next;
            } else{
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        // Append the remaining nodes, if any
        while(p1!=null){
            p.next = p1;
            p1 = p1.next;
            p = p.next;
        }
        while(p2!=null){
            p.next = p2;
            p2 = p2.next;
            p = p.next;
        }
        return dummy.next;
    }
}
