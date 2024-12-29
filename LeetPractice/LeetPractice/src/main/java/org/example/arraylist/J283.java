package org.example.arraylist;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 24 17 42
 **/
public class J283 {
    public void moveZeroes(int[] nums) {

        int count = removeElement(nums, 0);
        System.out.println(nums);
        for(int p = count; p < nums.length; p++){
            nums[p] = 0;
        }

    }
    public int removeElement(int[] nums, int val){
        int slow = 0, fast = 0;
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
