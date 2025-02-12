package org.example.arraylist;

import java.util.Arrays;

/**
 * @Author Haoran_Yang
 * @Date 2025 01 08 13 10
 **/
public class LCR_172 {
    public int countTarget(int[] scores, int target) {
        int index = Arrays.binarySearch(scores, target);
        int left_boun, right_boun, res;
        if (index < 0) {
            res = 0;
        } else {
            left_boun = index; right_boun = index;
            while (left_boun > 0 && scores[left_boun - 1] == target) {
                left_boun --;
            }
            while (right_boun < scores.length - 1 && scores[right_boun + 1] == target) {
                right_boun ++;
            }
            res = right_boun - left_boun + 1;
        }
        return res;
    }
}
