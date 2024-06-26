package ru.job4j.loop;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int month = Fitness.calc(95, 90);
        Assert.assertThat(month, Is.is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        int month = Fitness.calc(90, 95);
        assertThat(month, Is.is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitness.calc(50, 90);
        assertThat(month, Is.is(2));
    }

    @Test
    public void whenAllSame() {
        int month = Fitness.calc(90, 90);
        assertThat(month, Is.is(1));
    }
}