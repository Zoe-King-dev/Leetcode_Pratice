package org.example.arraylist;

/**
 * @Author Haoran_Yang
 * @Date 2025 01 07 18 16
 **/
public class J704 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        // Let mid in the while to ensure mid changing with loop
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }
}
