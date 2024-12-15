package org.example.linkList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Haoran_Yang
 * @Date 2024 10 25 11 05
 **/
public class J2085 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next==null || head.next.next==null || head.next.next.next==null){
            return new int[]{-1,-1};
        }

        List<Integer> localExtremumList = new ArrayList<>();
        ListNode cur = head.next;
        ListNode pre = head;
        int index = 1;
        while(cur.next != null) {
            if ((pre.val < cur.val && cur.val > cur.next.val)
                    || (pre.val > cur.val && cur.val < cur.next.val)) {
                localExtremumList.add(index);
            }
            pre = cur;
            cur = cur.next;
            index ++;
        }

        int maxDistence = localExtremumList.get(localExtremumList.size() - 1) - localExtremumList.get(0);
        int minDistence = Integer.MAX_VALUE;
        for(int i = 1; i < localExtremumList.size(); i++){
            int minNew = localExtremumList.get(i) - localExtremumList.get(i - 1);
            if(minNew < minDistence){
                minDistence = minNew;
            }
        }
        return new int[]{minDistence, maxDistence};
    }

}
