package org.example.arraylist;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Haoran_Yang
 * @Date 2025 01 06 16 58
 **/
public class J567 {
    public boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();
        int left = 0, right = 0, valid = 0;
        boolean flag = false;

        // write s1 into hashmap
        for (char c : s1.toCharArray()){
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        //Sliding window
        //IMPORTANT 1: Sliding rule is only manipulate window in while, dont initialize window before while
        //IMPORTANT 2: only values in 'need' HashMap should be put in 'window'
        while (right < s2.length()) {
            char c = s2.charAt(right);
            right ++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (need.get(c).intValue() == window.get(c).intValue()) {
                    valid ++;
                }
            }

            while (right - left >= s1.length()) {
                if (valid == need.size()){
                    flag = true;
                    break;
                }
                char d = s2.charAt(left);
                left++;
                if (need.containsKey(d)) {

                    if (need.get(d).intValue() == window.get(d).intValue()) {
                        valid --;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
            if (valid == need.size()){
                flag = true;
                break;
            }
        }
        return flag;
    }
}



// Attempt 1 (Failed)
/*
public boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();
        int left = 0, right = left + s1.length(), valid = 0;
        boolean flag = false;

        // write s1 into hashmap
        for (char c : s1.toCharArray()){
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        //write initial substring of s2 into hashmap, and calculate its valid
        for (int i = left; i < right; i++){
            char c = s2.charAt(i);
            window.put(c, window.getOrDefault(c, 0) + 1);
        }
        Set<Character> windowKeys = window.keySet();
        for (Character c : windowKeys) {
            if (need.containsKey(c) && need.get(c).equals(window.get(c))) {
                valid ++;
            }
        }
        if (valid == need.size()){
            flag = true;
        }

        //Sliding window
        while (right < s2.length()) {
            char c = s2.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (need.containsKey(c)) {
                if (need.get(c).equals(window.get(c))) {
                    valid ++;
                }
            }
            right ++;
            char d = s2.charAt(left);
            if (need.containsKey(d)) {
                if (need.get(d).equals(window.get(d))) {
                    valid --;
                }
            }
            window.put(d, window.get(d) - 1);
            if (need.containsKey(d)) {
                if (need.get(d).equals(window.get(d))) {
                    valid ++;
                }
            }
            left++;

            if (valid == need.size()){
                flag = true;
                break;
            }
        }
        return flag;
    }
*/
