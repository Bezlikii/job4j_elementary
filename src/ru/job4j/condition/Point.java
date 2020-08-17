package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double arg1 = x1 - x2;
        double powArg1 = Math.pow(arg1, 2);
        double arg2 = y2 - y1;
        double powArg2 = Math.pow(arg2, 2);
        double sumArgs = powArg1 + powArg2;
        double rsl = Math.sqrt(sumArgs);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(6, 9, 13, 3);
        System.out.println("result (6, 9) to (8, 3) " + result);
    }
}
