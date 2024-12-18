package org.example.linkList;

import java.util.ArrayList;
import java.util.List;

public class J2085 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // Check if the list has at least three nodes
        if (head.next == null || head.next.next == null || head.next.next.next == null) {
            return new int[]{-1, -1};
        }

        // Find local extremum points and store their indices
        List<Integer> localExtremumList = new ArrayList<>();
        ListNode cur = head.next;
        ListNode pre = head;
        int index = 1;
        while (cur.next != null) {
            if ((pre.val < cur.val && cur.val > cur.next.val) || (pre.val > cur.val && cur.val < cur.next.val)) {
                localExtremumList.add(index);
            }
            pre = cur;
            cur = cur.next;
            index++;
        }

        // Calculate minimum and maximum distances between local extremum points
        int maxDistance = localExtremumList.get(localExtremumList.size() - 1) - localExtremumList.get(0);
        int minDistance = Integer.MAX_VALUE;
        for (int i = 1; i < localExtremumList.size(); i++) {
            int minNew = localExtremumList.get(i) - localExtremumList.get(i - 1);
            if (minNew < minDistance) {
                minDistance = minNew;
            }
        }
        return new int[]{minDistance, maxDistance};
    }
}
