package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class FitTest {

    @Test
    public void whenManWeightIs187D() {
        double in = 187.00;
        double expected = 100.05;
        double out = Fit.manWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanWeightIs187D() {
        double in = 187.00;
        double expected = 88.55;
        double out = Fit.womanWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void testWomanWeightHeightSmallerThanCorrection() {
        double in = 100.00;
        double expected = 0;
        double out = Fit.womanWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void testManWeightSmallerThanCorrection() {
        double in = 99.00;
        double expected = 0;
        double out = Fit.manWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void testManWeightHeightLargerThanCorrection() {
        double in = 200.00;
        double expected = 115.00;
        double out = Fit.manWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void testWomanWeightLargerThanCorrection() {
        double in = 200.00;
        double expected = 103.50;
        double out = Fit.womanWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);
    }

}