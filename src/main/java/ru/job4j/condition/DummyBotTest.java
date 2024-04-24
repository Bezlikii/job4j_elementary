package ru.job4j.condition;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        Assert.assertThat(
                DummyBot.answer("Привет, Бот."),
                Is.is("Привет, умник.")
        );
    }

    @Test
    public void whenByeBot() {
        Assert.assertThat(
                DummyBot.answer("Пока."),
                Is.is("До скорой встречи.")
        );
    }

    @Test
    public void whenUnknownBot() {
        Assert.assertThat(
                DummyBot.answer("Сколько будет 2 + 2?"),
                Is.is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}