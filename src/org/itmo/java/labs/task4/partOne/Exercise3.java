package org.itmo.java.labs.task4.partOne;

import java.util.Scanner;

public class Exercise3 {
    public static Integer[] inputNumbers = new Integer[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        inputNumbers[0] = Integer.parseInt(sc.next());
        System.out.println("Введите второе число:");
        inputNumbers[1] = Integer.parseInt(sc.next());
        System.out.println("Введите третье число:");
        inputNumbers[2] = Integer.parseInt(sc.next());
        Integer sum = inputNumbers[0] + inputNumbers[1];
        //Переменной присваивается true, если сумма первых двух чисел равна третьему числу
        System.out.println("Результат: " + (sum.equals(inputNumbers[2])));
    }
}
