package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{5}, {3, 2}, {1, 7, 6}, {8, 4, 2, 5}};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Размер вложенного массива равен: " + array[i].length);
        }
    }
}
