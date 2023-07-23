package ru.job4j.condition;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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
}