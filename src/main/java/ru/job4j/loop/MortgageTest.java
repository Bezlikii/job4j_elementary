package ru.job4j.loop;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.loop.Mortgage;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void when1Year() {
        int year = Mortgage.year(1000, 1200, 1);
        Assert.assertThat(year, Is.is(1));
    }

    @Test
    public void when2Year() {
        int year = Mortgage.year(100, 120, 50);
        Assert.assertThat(year, Is.is(2));
    }
}