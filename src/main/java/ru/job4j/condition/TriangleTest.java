package ru.job4j.condition;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        Assert.assertThat(result, Is.is(true));
    }
}