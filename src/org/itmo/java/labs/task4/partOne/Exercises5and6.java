package org.itmo.java.labs.task4.partOne;

import java.util.Scanner;

import static java.lang.System.*;

public class Exercises5and6 {
    public static Integer[] InputNumbers = new Integer[7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введите семь чисел:");
        for (int i = 0; i < InputNumbers.length; i++) {
            InputNumbers[i] = Integer.parseInt(sc.next());
        }

        out.println("array: " + InputNumbers);
        //Переменной присваивается true, если первое или последнее введённое число равно 3
        Boolean isThree = (InputNumbers[0] == 3 | InputNumbers[InputNumbers.length - 1] == 3) ? true : false;
        out.println(isThree);

        //Переменной присваивается true, если массив содержит число 1 или 3
        boolean isOneOrThree = false;
        for (Integer i : InputNumbers) {
            if (InputNumbers[i] == 1 | InputNumbers[i] == 3) ;
            {
                isOneOrThree = true;
                break;
            }
        }
        out.println(isOneOrThree);
    }
}
