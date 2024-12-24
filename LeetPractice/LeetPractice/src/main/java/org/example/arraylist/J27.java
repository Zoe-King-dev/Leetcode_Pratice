package org.example.arraylist;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 24 17 04
 **/
public class J27 {
    public int removeElement(int[] nums, int val) {
        int fast = 0, slow = 0;
        while(fast < nums.length){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow ++;
            }
            fast ++;
        }
        return slow;
    }
}
