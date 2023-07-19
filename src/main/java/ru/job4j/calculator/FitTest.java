package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class FitTest {

    @Test
    public void whenManWeightIs187D() {
        double in = 187.00;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanWeightIs178D() {
        double in = 187.00;
        double expected = 88.55;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}