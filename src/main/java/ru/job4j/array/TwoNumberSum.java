package ru.job4j.array;

import java.util.Arrays;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] sortArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortArray);

        int left = 0;
        int right = sortArray.length - 1;

        while (left < right) {
            if (sortArray[left] + sortArray[right] == target) {
                return new int[] {left, right};
            } else if (sortArray[left] + sortArray[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}
