package ru.job4j.loop;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        int rsl = Factorial.calc(5);
        int expected = 120;
        Assert.assertThat(rsl, Is.is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int rsl = Factorial.calc(0);
        int expected = 1;
        Assert.assertThat(rsl, Is.is(expected));
    }
}