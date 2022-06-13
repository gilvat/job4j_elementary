package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenTuesday2() {
        int expected = 2;
        String name = "Tuesday";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSaturday6() {
        int expected = 6;
        String name = "Суббота";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }
}