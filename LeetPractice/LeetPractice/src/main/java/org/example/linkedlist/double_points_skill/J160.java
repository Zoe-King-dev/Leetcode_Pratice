package org.example.linkedlist.double_points_skill;

import org.example.linkedlist.ListNode;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 18 14 42
 **/
public class J160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;

        // Splice two LInkList
        while(p1 != p2){
            //***IMP***: Can not judge != in IF, cause when it's null,
            // in ELSE followed it can't find next and deliver it to headB

            p1 = (p1 == null)? headB : p1.next;
            p2 = (p2 == null)? headA : p2.next;

//            if(p1 == null){
//                p1 = headB;
//            } else {
//                p1 = p1.next;
//            }
//            if(p2 != null){
//                p2 = headA;
//            } else {
//                p2 = p2.next;
//            }
        }
        return p1;
    }
}
