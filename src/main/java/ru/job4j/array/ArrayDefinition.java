package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);

        names[0] = "Вася";
        names[1] = "Петя";
        names[2] = "Настя";
        names[3] = "Алена";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
