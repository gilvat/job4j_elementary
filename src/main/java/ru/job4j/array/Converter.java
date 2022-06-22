package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = count + array[i].length;
        }
        int[] sum = new int[count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum[count] = array[i][j];
                count++;
            }
        }
        return ArrayInSquareArray.convertArray(sum);
    }
}
