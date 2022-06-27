package org.itmo.java.labs.task4;

import java.util.Scanner;

public class Exercise3 {
    public static Integer[] InputNumbers = new Integer[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        InputNumbers[0] = Integer.parseInt(sc.next());
        System.out.println("Введите второе число:");
        InputNumbers[1] = Integer.parseInt(sc.next());
        System.out.println("Введите третье число:");
        InputNumbers[2] = Integer.parseInt(sc.next());
        Integer sum = InputNumbers[0] + InputNumbers[1];
        //Переменной присваивается true, если сумма первых двух чисел равна третьему числу
        Boolean eq = (sum == InputNumbers[2]) ? true : false;
        System.out.println("Результат: "+eq);
    }
}
