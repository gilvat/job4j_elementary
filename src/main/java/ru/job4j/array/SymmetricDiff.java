package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] sum = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    sum[count++] = left[i];
                }
            }
        }
        int[] arr2 = Arrays.copyOf(sum, count);
        count = 0;
        for (int i = 0; i < left.length; i++) {
            boolean chek = true;
            for (int j = 0; j < arr2.length; j++) {
                if (left[i] == arr2[j]) {
                    chek = false;
                }
            }
            if (chek) {
                sum[count++] = left[i];
            }
        }

        for (int i = 0; i < right.length; i++) {
            boolean chek = true;
            for (int j = 0; j < arr2.length; j++) {
                if (right[i] == arr2[j]) {
                    chek = false;
                }
            }
            if (chek) {
                sum[count++] = right[i];
            }
        }
        int[] arr3 = Arrays.copyOf(sum, count);
        return arr3;
    }
}