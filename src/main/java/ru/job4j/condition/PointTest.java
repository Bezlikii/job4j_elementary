package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.PotentialAssignment;
import ru.job4j.condition.Point;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenDistanceIsOk() {
        int x1 = 6;
        int y1 = 9;
        int x2 = 13;
        int y2 = 3;

        double expected = 9.21;

        double out = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, out, 0.01);
    }
}