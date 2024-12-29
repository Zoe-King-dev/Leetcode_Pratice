package org.example;

import org.example.arraylist.J5;

/**
 * @Author Haoran_Yang
 * @Date 2024 10 20 10 01
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("simple test:");
        /*J283 j283 = new J283();
        int[] nums = {0,1,0,3,12};
        // [0,1,0,3,12]
        j283.moveZeroes(nums);
        System.out.println(nums);*/

        /*J27 j27 = new J27();
        int[] nums2 = {3,2,2,3};
        System.out.println(j27.removeElement(nums, 0));*/

        J5 j5 = new J5();
        String s = "babad";
        System.out.println(j5.longestPalindrome(s));

    }
}
