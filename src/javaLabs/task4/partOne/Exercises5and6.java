package javaLabs.task4.partOne;

import java.util.Scanner;

import static java.lang.System.*;

public class Exercises5and6 {
    public static Integer[] inputNumbers = new Integer[7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введите семь чисел:");
        for (int i = 0; i < inputNumbers.length; i++) {
            inputNumbers[i] = Integer.parseInt(sc.next());
        }

        out.println("array: " + inputNumbers);
        //Переменной присваивается true, если первое или последнее введённое число равно 3
        Boolean isThree = ((inputNumbers[0] == 3) || (inputNumbers[inputNumbers.length - 1] == 3));
        out.println(isThree);

        //Переменной присваивается true, если массив содержит число 1 или 3
        boolean isOneOrThree = false;
        for (Integer i : inputNumbers) {
            if (inputNumbers[i] == 1 | inputNumbers[i] == 3) ;
            {
                isOneOrThree = true;
                break;
            }
        }
        out.println(isOneOrThree);
    }
}
