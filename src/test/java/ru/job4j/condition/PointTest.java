package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when15To25Then1() {
        double expected = 1;
        int x1 = 1;
        int y1 = 5;
        int x2 = 2;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when05To65Then6() {
        double expected = 6;
        int x1 = 0;
        int y1 = 5;
        int x2 = 6;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10To45Then5dot83() {
        double expected = 5.83;
        int x1 = 1;
        int y1 = 0;
        int x2 = 4;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

}