package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow(x1 - x2, 2)) + Math.pow(y1 - y2, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(2, 8, 1, 4);
        System.out.println("result (2, 8) to (1, 4) " + result);
        result = Point.distance(6, 2, 13, 2);
        System.out.println("result (6, 2) to (13, 2) " + result);
        result = Point.distance(15, 12, 3, 4);
        System.out.println("result (15, 12) to (3, 4) " + result);
    }
}