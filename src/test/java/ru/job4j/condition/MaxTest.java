package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax10To2Then10() {
        int left = 10;
        int right = 2;
        Max max = new Max();
        int  sravn = max.max(left, right);
        int expected = 10;
        Assert.assertEquals(sravn, expected);
    }

    @Test
    public void whenMax10To2To12Then12() {
        int left = 10;
        int right = 2;
        int center = 12;
        Max max = new Max();
        int  sravn = max.max(left, right, center);
        int expected = 12;
        Assert.assertEquals(sravn, expected);
    }

    @Test
    public void whenMax10To2To12To34Then34() {
        int left = 10;
        int right = 2;
        int center = 12;
        int botom = 34;
        Max max = new Max();
        int  sravn = max.max(left, right, center, botom);
        int expected = 34;
        Assert.assertEquals(sravn, expected);
    }

}