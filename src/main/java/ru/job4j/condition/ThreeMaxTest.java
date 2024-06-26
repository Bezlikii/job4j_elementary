package ru.job4j.condition;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class ThreeMaxTest {

    @Test
    public void firstMax() {
        int rsl = ThreeMax.max(10, 5, 1);
        Assert.assertThat(rsl, Is.is(10));
    }

    @Test
    public void secondMax() {
        int rsl = ThreeMax.max(10, 50, 1);
        Assert.assertThat(rsl, Is.is(50));
    }

    @Test
    public void thirdMax() {
        int rsl = ThreeMax.max(1, 5, 100);
        Assert.assertThat(rsl, Is.is(100));
    }

    @Test
    public void allEq() {
        int rsl = ThreeMax.max(1, 1, 1);
        Assert.assertThat(rsl, Is.is(1));
    }

    @Test
    public void firstEqSecond() {
        int rsl = ThreeMax.max(10, 10, 1);
        Assert.assertThat(rsl, Is.is(10));
    }

    @Test
    public void firstEqThird() {
        int rsl = ThreeMax.max(100, 1, 100);
        Assert.assertThat(rsl, Is.is(100));
    }

    @Test
    public void secondEqThird() {
        int rsl = ThreeMax.max(1, 100, 100);
        Assert.assertThat(rsl, Is.is(100));
    }
}