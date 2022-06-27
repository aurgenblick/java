package org.itmo.java.labs.task4;

import java.util.Scanner;

public class Exercise5 {
    public static Integer[] InputNumbers = new Integer[7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите семь чисел:");
        for (int i = 0; i < InputNumbers.length; i++) {
            InputNumbers[i] = Integer.parseInt(sc.next());
        }

        System.out.println("array: " + InputNumbers);
        //Переменной присваивается true, если первое или последнее введённое число равно 3
        Boolean isThree = (InputNumbers[0] == 3 | InputNumbers[InputNumbers.length - 1] == 3) ? true : false;
        System.out.println(isThree);
    }
}
