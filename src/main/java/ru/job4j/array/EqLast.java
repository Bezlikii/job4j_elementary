package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        int leftLength = left.length - 1;
        int rightLength = right.length - 1;

        if (left[leftLength] == right[rightLength]) {
            return true;
        }
        return false;
    }
}
