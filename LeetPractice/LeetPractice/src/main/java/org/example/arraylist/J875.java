package org.example.arraylist;

/**
 * @Author Haoran_Yang
 * @Date 2025 01 08 15 30
 **/
public class J875 {
    public int minEatingSpeed(int[] piles, int h) {
        int maxCount = 1;
        for (int pile : piles) {
            maxCount = Math.max(maxCount, pile);
        }
        int left = 1, right = maxCount + 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (calculateTime(piles, mid) > h) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public long calculateTime(int[] piles, int speed) {
        // IMPORTANT: When process large number, int could lead to mistake. Long is better
        long sum = 0;
        for (long pile : piles) {
            sum += (pile + speed - 1) / speed;
        }
        return sum;
    }
}
