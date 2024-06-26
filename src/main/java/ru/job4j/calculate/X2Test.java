package ru.job4j.calculate;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenBCZero() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenAllIsOne() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenAisNull() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCIsNull() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenXIsNull() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertThat(rsl, Matchers.is(expected));
    }
}