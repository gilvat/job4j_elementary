package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] funk = new int[5];
        for (int i = 0; i < 5; i++) {
            funk[i] = i * 2 + 3;
        }
        for (int num : funk) {
            System.out.println(num);
        }
    }
}
