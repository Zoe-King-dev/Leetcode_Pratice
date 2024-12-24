package org.example.arraylist;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 24 15 39
 **/
public class J26 {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
