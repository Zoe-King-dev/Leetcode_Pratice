package org.example.arraylist;

/**
 * @Author Haoran_Yang
 * @Date 2024 12 28 19 02
 **/
public class J167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left != right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left + 1, right + 1};
            }
            if(sum < target){
                left ++;
            }
            if(sum > target){
                right --;
            }
        }
        return new int[]{-1, -1};
    }
}
