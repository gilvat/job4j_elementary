package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] sum = new int[right.length + 1];
        sum[0] = left[0];
        sum[sum.length - 1] = left[left.length - 1];
        for (int i = 1; i < middle.length; i = i + 2) {
            sum[i + 1] = middle[i];
        }
        for (int i = 0; i < right.length; i = i + 2) {
            sum[i + 1] = right[i];
        }
        return sum;
    }
}