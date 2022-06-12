package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDivSub(double first, double second) {
        return div(first, second) + sub(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + div(first, second) + sub(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Rezultat rascheta №1 raven: " + sumAndMultiply(10, 20));
        System.out.println("Rezultat rascheta №2 raven: " + sumDivSub(10, 20));
        System.out.println("Rezultat rascheta №3 raven: " + sumAll(10, 20));
    }
}
