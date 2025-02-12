package org.example.arraylist;

/**
 * @Author Haoran_Yang
 * @Date 2025 01 08 12 33
 **/
public class J34 {
    public int[] searchRange(int[] nums, int target) {
        // Method 1: use binarySearch function
        /*int index = Arrays.binarySearch(nums, target);
        int left_boun = index, right_boun = index;
        if (index >= 0) {
            while (left_boun > 0 && nums[left_boun - 1] == target) {
                left_boun --;
            }
            while (right_boun < nums.length - 1 && nums[right_boun + 1] == target) {
                right_boun ++;
            }
        } else {
            left_boun = -1; right_boun = -1;
        }
        int[] res = {left_boun, right_boun};
        return res;*/

        // Method 2: implement binary search (leftBound rightBound condition)
        int left = findLeftBoundary(nums, target);
        int right = findRightBoundary(nums, target);

        return new int[] {left, right};
    }

    public int findLeftBoundary(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        // find left boundary
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        // Importantl
        if (left < 0 || left >= nums.length) {
            return -1;
        }
        return nums[left] == target ? left : -1;
    }

    public int findRightBoundary (int[] nums, int target) {
        // find right boundary
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        // Important
        if (right < 0 || right >= nums.length) {
            return -1;
        }
        return nums[right] == target ? right : -1;
    }
}
