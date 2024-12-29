package org.example.arraylist;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 29 18 20
 **/
public class J76 {
    public String minWindow(String s, String t) {
        // Choose map as data structure
        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();
        char[] tArray = t.toCharArray();
        for(char c : tArray) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0, valid = 0;
        // Variables record window for return use
        int start = 0, windowLen = Integer.MAX_VALUE;

        while (right < s.length()) {
            char c = s.charAt(right);
            right ++;
            if(need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(window.get(c).equals(need.get(c))) {
                    valid ++;
                }
            }

            //Code below Only execute when window contains enough char
            while(valid == need.size()){
                // update window's length
                if(right - left < windowLen){
                    start = left;
                    windowLen = right - left;
                }
                char o = s.charAt(left);
                left ++;
                if(need.containsKey(o)){
                    // Change counter first
                    if(window.get(o).equals(need.get(o)))
                        valid --;
                    // Change map entity then
                    window.put(o, window.getOrDefault(o, 0) - 1);
                }
            }
        }
        /* String res = "";
        if(windowLen != Integer.MAX_VALUE){
            res = s.substring(start, windowLen);
        }*/

        return windowLen == Integer.MAX_VALUE ? "" : s.substring(start, start + windowLen);
    }
}
