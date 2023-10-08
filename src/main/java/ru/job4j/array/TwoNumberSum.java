package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        while (i < array.length) {
            if (array[i] + array[j] == target) {
                return SortSelected.sort(new int[]{j, i});
            }
            if (i + 1 == array.length) {
                j++;
                i = j + 1;
            }
            if (i + 1 == j) {
                i += 2;
            } else {
                    i++;
                }
        }
        return new int[0];
    }

}
