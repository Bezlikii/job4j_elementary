package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.PotentialAssignment;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 6;
        int y1 = 9;
        int x2 = 12;
        int y2 = 3;

        double expected = 9.219544457292887;

        double rsl = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(rsl, rsl, 0.01);
    }
}