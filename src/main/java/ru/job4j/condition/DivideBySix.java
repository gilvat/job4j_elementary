package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (isDiv3(number) && isDiv2(number)) {
            rsl = "Исходное число делится на 6.";
        } else if (isDiv3(number) && !isDiv2(number)) {
            rsl = "Исходное число делится на 3, но не является четным.";
        } else if (!isDiv3(number) && isDiv2(number)) {
            rsl = "Исходное число не делится на 3, но является четным.";
        } else {
            rsl = "Исходное число не делится на 3 и не является четным.";
        }
        return rsl;
    }

    private static boolean isDiv3(int num) {
        return num % 3 == 0;
    }

    private static boolean isDiv2(int num) {
        return num % 2 == 0;
    }
}