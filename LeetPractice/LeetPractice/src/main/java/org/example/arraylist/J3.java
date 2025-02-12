package org.example.arraylist;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Haoran_Yang
 * @Date 2025 01 07 15 50
 **/
public class J3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        int left = 0, right = 0, res = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            right ++;
            counter.put(c, counter.getOrDefault(c, 0) + 1);

            while(counter.get(c) > 1) {
                char d = s.charAt(left);
                left ++;
                counter.put(d, counter.get(d) - 1);
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
