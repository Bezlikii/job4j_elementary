package ru.job4j.loop;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.loop.PrimeNumber;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int count = PrimeNumber.calc(5);
        Assert.assertThat(count, Is.is(3));
    }

    @Test
    public void when11() {
        int count = PrimeNumber.calc(11);
        Assert.assertThat(count, Is.is(5));
    }

    @Test
    public void when2() {
        int count = PrimeNumber.calc(2);
        Assert.assertThat(count, Is.is(1));
    }
}