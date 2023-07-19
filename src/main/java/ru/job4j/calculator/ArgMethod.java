package ru.job4j.calculator;

import org.w3c.dom.ls.LSOutput;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void hello(int age) {
        System.out.println("Hello, your age is " + age);
    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name);
        System.out.println("Your age is " + age);
    }

    public static void hello(String name1, String name2, String name3) {
        System.out.println("Hello " + name1 + " or " + name2 + " or " + name3);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name);

        ArgMethod.hello(name, age);

        ArgMethod.hello(age);

        ArgMethod.hello(name, name, name);
    }

}
