package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {

    @Test
    public void when123Then321() {
        int[] input = {1, 2, 3};
        int[] result = Turn.back(input);
        int[] expected = {3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when123456Then654321() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = Turn.back(input);
        int[] expected = {6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }
}