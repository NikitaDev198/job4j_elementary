package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst5ToSecond2ToThird31Then31() {
        int first = 5;
        int second = 2;
        int third = 31;
        int result = Max.max(first, second, third);
        int expected = 31;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst3ToSecond18ToThird10ToFourth12Then18() {
        int first = 3;
        int second = 18;
        int third = 10;
        int fourth = 12;
        int result = Max.max(first, second, third, fourth);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

}