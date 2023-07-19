package ru.job4j.calculator;

import static ru.job4j.calculator.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractionAndDivision(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double allMethodsSum(double first, double second) {
        return sum(first, second) + subtraction(first, second) + multiply(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + allMethodsSum(10, 20));
    }

}
