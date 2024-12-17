package org.example;
import org.example.linkList.*;

/**
 * @Author Haoran_Yang
 * @Date 2024 10 20 10 01
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        J1290 linkList = new J1290();
        /*ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        System.out.println(linkList.getDecimalValue(head));*/

        J2085 j2085 = new J2085();
        /*ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(2);
        int[] result = j2085.nodesBetweenCriticalPoints(head);
        System.out.println(result);*/

        J21 j21 = new J21();
/*        ListNode list1 = new ListNode(-9);
        list1.next = new ListNode(3);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(7);

        ListNode merge = j21.mergeTwoLists(list1, list2);*/

        J86 j86 = new J86();
        J86_repratice1 j86Repratice1 = new J86_repratice1();
        /*ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(2);
        ListNode result = j86Repratice1.partition(head, 3);*/

        J142 j142 = new J142();
        // [3,2,0,-4]
/*        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        ListNode result = j142.detectCycle(head);*/

        J19 j19 = new J19();
        /*ListNode head = new ListNode(1);
        ListNode result = j19.removeNthFromEnd(head, 1);*/

        J876 j876 = new J876();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        //head.next.next.next.next.next.next = new ListNode(2);
        System.out.println(j876.middleNode(head));


    }
}
