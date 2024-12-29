package org.example.arraylist;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 28 19 12
 **/
public class J344 {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while(left < right){
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left ++;
            right --;
        }
    }
}
