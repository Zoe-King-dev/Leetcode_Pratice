package org.example.arraylist;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 29 14 39
 **/
public class J5 {
    public String longestPalindrome(String s) {
        String res = "";
        for(int i = 0; i < s.length(); i++){
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i + 1);
            String tmp = s1.length() > s2.length() ? s1: s2;
            res = res.length() > tmp.length() ? res : tmp;
        }
        return res;
    }
    public String palindrome(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l --;
            r ++;
        }
        return s.substring(l + 1, r);
    }
}
