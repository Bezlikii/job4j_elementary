package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenDistanceIsOk() {
        Point a = new Point(6, 9);
        Point b = new Point(13, 3);
        double expected = 9.21;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}