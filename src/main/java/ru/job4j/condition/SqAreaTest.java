package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenSqAreaTestIsOk() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square(p, k);

        Assert.assertEquals(expected, out, 0.1);

    }
}