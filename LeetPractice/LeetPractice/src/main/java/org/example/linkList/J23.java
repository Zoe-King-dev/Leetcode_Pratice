package org.example.linkList;

import java.util.PriorityQueue;

/**
 * @Author Haoran_Yang
 * @Date 2024 10 29 19 30
 **/
public class J23 {
    public ListNode mergeKLists(ListNode[] lists) {

        //Consider null situation
        if(lists==null) return null;

        //create dummy node
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        //create PriorityQueue
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b)->(a.val - b.val));


        //insert nodes into PriorityQueue


        return null;
    }
}
