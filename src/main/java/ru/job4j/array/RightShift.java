package ru.job4j.array;

public class RightShift {

    public static int[] shift(int[] nums, int count) {
        int temp = 0;
        int index;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[(nums.length * 2 - count + i) % nums.length];
            nums[i] = temp;
            }
        return nums;
    }

       private static void shift(int[] nums) {

    }

}
