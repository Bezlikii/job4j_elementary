package ru.job4j.condition;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.MultiMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        Assert.assertThat(result, Is.is(4));
    }
}