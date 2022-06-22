package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int length = array.length;
        int dim = (length == Math.pow((int) Math.sqrt(length), 2) ? (int) Math.sqrt(length) : (int) Math.sqrt(length) + 1);
        int[][] sum = new int[dim][dim];
        int[] newArray = new int[dim * dim];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (i < array.length ? array[i] : 0);
        }
        int count = 0;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                sum[i][j] = newArray[count];
                count++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Math.sqrt(9));
        int b = 9;
        int a = (b == Math.pow((int) Math.sqrt(b), 2) ? (int) Math.sqrt(b) : (int) Math.sqrt(b) + 1);
        System.out.println(a);
    }

}