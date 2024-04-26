package ru.job4j.condition;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        Assert.assertThat(result, Is.is(2));
    }

    @Test
    public void whenMax4To1Then2() {
        int result = Max.max(4, 1);
        Assert.assertThat(result, Is.is(4));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(3, 3);
        Assert.assertThat(result, Is.is(3));
    }

    @Test
    public void whenMax3Numbers() {
        int result = Max.max(4, 8, 6);
        Assert.assertThat(result, Is.is(8));
    }

    @Test
    public void whenMax4Numbers() {
        int result = Max.max(4, 8, 6, 14);
        Assert.assertThat(result, Is.is(14));
    }
}
