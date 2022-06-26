package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when28To14Then4dot12() {
        Point a = new Point(2, 8);
        Point b = new Point(1, 4);
        double dist = a.distance(b);
        double expected = 4.12;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when62To132Then7() {
        double expected = 7;
        Point a = new Point(6, 2);
        Point b = new Point(13, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when1512To34Then14dot42() {
        double expected = 14.42;
        Point a = new Point(15, 12);
        Point b = new Point(3, 4);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);

    }

    @Test
    public void when0012To10110Then19dot64() {
        double expected = 19.64;
        Point a = new Point(0, 0, 12);
        Point b = new Point(10, 11, 0);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when000To023Then4dot12() {
        double expected = 4.12;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 3);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);

    }
}