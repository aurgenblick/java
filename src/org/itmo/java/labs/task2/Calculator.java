package org.itmo.java.labs.task2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
//Testing for double values
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two Double numbers: ");
        double number1 = Double.parseDouble(sc.next());
        double number2 = Double.parseDouble(sc.next());
        System.out.println("Double numbers: " + number1 + " and " + number2);
        System.out.println("The sum of these numbers is " + sum(number1, number2));
        System.out.println("The quotient of these numbers is " + div(number1, number2));
        System.out.println("The product of these numbers is " + mult(number1, number2));
        System.out.println("The difference between these numbers is " + subt(number1, number2));
//Testing for long values
        System.out.println("Please enter two Long numbers: ");
        long number3 = Long.parseLong(sc.next());
        long number4 = Long.parseLong(sc.next());
        System.out.println("Long numbers: " + number3 + " and " + number4);
        System.out.println("The sum of these numbers is " + sum(number3, number4));
        System.out.println("The quotient of these numbers is " + div(number3, number4));
        System.out.println("The product of these numbers is " + mult(number3, number4));
        System.out.println("The difference between these numbers is " + subt(number3, number4));
//Testing for int values
        System.out.println("Please enter two Integer numbers: ");
        int number5 = Integer.parseInt(sc.next());
        int number6 = Integer.parseInt(sc.next());
        System.out.println("Int numbers: " + number5 + " and " + number6);
        System.out.println("The sum of these numbers is " + sum(number5, number6));
        System.out.println("The quotient of these numbers is " + div(number5, number6));
        System.out.println("The product of these numbers is " + mult(number5, number6));
        System.out.println("The difference between these numbers is " + subt(number5, number6));

    }

    //SUMMING
    public static double sum(double number1, double number2) {
        return number1 + number2;
    }

    public static long sum(long number1, long number2) {
        return number1 + number2;
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    //DIVIDING
    public static double div(double number1, double number2) {
        return number1 / number2;
    }

    public static long div(long number1, long number2) {
        return number1 / number2;
    }

    public static double div(int number1, int number2) {
        return (long) (number1 / number2);
    }

    //MULTIPLYING
    public static double mult(double number1, double number2) {
        return number1 * number2;
    }

    public static long mult(long number1, long number2) {
        return number1 * number2;
    }

    public static int mult(int number1, int number2) {
        return number1 * number2;
    }

    //SUBTRACTING
    public static double subt(double number1, double number2) {
        return number1 - number2;
    }

    public static long subt(long number1, long number2) {
        return number1 - number2;
    }

    public static int subt(int number1, int number2) {
        return number1 - number2;
    }
}
