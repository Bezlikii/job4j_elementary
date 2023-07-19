package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;

        int creditSumOneYear = (int) (amount * percent);

        while (creditSumOneYear > 0) {

            int howMuchIsLeft = (int) (creditSumOneYear - salary);
            year += 1;

        }
        return year;
    }
}
