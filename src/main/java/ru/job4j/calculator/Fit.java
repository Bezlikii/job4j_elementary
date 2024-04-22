package ru.job4j.calculator;

public class Fit {

    private static final double MAN_HEIGHT_CORRECTION = 100;
    private static final double WOMAN_HEIGHT_CORRECTION = 110;
    private static final double WEIGHT_COEFFICIENT = 1.15;

    public static double manWeight(short height) {
        if (height <= MAN_HEIGHT_CORRECTION) {
            return 0;
        } else {
            return (height - MAN_HEIGHT_CORRECTION) * WEIGHT_COEFFICIENT;
        }
    }

    public static double womanWeight(short height) {
        if (height <= WOMAN_HEIGHT_CORRECTION) {
            return 0;
        } else {
            return (height - WOMAN_HEIGHT_CORRECTION) * WEIGHT_COEFFICIENT;
        }
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heightWoman);
        System.out.printf("Man 187 is %.2f kg%n", man);
        System.out.printf("Woman 170 is %.2f kg%n", woman);
    }
}
