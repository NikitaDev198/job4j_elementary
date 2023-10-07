package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSort34125Then12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort730Then037() {
        int[] data = new int[] {7, 3, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 3, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort83115Then11358() {
        int[] data = new int[] {8, 3, 1, 1, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 1, 3, 5, 8};
        assertThat(result).containsExactly(expected);
    }

}