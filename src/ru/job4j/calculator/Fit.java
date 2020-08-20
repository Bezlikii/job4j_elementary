package ru.job4j.calculator;

public class Fit {

    // Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    // Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
    }

}
