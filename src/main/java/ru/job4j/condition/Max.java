package ru.job4j.condition;

public class Max {

    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int therd) {
        return max(
                first,
                max(second, therd)
        );
    }

    public int max(int first, int second, int therd, int fourth) {
        return max(
                first,
                max(second, therd, fourth)
        );
    }

}
