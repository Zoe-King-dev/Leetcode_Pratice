package org.example.linkedlist.double_points_skill;

import org.example.linkedlist.ListNode;

import java.util.PriorityQueue;

/**
 * @Author Haoran_Yang
 * @Date 2024 10 29 19 30
 **/
public class J23 {
    public ListNode mergeKLists(ListNode[] lists) {

        //Consider null situation
        if(lists == null || lists.length == 0) return null;

        //create dummy node
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        //create PriorityQueue
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (ListNode a, ListNode b) -> (a.val - b.val));

        //insert nodes into PriorityQueue
        for(ListNode n : lists){
            if(n != null){
                pq.add(n);
            }
        }

        //poll nodes from PriorityQueue to dummy LinkList
        while(!pq.isEmpty()){
            ListNode temp = pq.poll();
            p.next = temp;
            // **IMP**: Remember to confirm the node is not null when you add
            if(temp.next != null) {
                pq.add(temp.next);
            }
            p = p.next;
        }

        return dummy.next;
    }
}
