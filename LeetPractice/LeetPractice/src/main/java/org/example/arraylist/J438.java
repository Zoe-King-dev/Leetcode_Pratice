package org.example.arraylist;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Author Haoran_Yang
 * @Date 2025 01 07 14 50
 **/
public class J438 {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0, valid = 0, lenP = p.length();
        LinkedList<Integer> list = new LinkedList<>();
        for (char c : p.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        while (right < s.length()) {
            char c = s.charAt(right);
            right ++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(window.get(c).intValue() == need.get(c).intValue()) {
                    valid ++;
                }
            }

            if (valid == need.size() && right - left == lenP) {
                list.add(left);
            }
            while (right - left >= lenP) {
                char d = s.charAt(left);
                left ++;
                if (need.containsKey(d)) {
                    if (window.get(d).intValue() == need.get(d).intValue()) {
                        valid --;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return list;
    }
}
