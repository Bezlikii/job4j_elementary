package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenDistanceIsOkFor2D() {
        Point a = new Point(6, 9);
        Point b = new Point(13, 3);
        double expected = 9.21;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistanceIsOkFor3D() {
        Point a = new Point(6, 9, 12);
        Point b = new Point(4, 8, 18);
        double expected = 6.40;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}