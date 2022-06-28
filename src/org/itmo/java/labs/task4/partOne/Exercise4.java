package org.itmo.java.labs.task4.partOne;
import java.util.Scanner;

public class Exercise4 {
    public static Integer[] InputNumbers = new Integer[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        InputNumbers[0] = Integer.parseInt(sc.next());
        System.out.println("Введите второе число:");
        InputNumbers[1] = Integer.parseInt(sc.next());
        System.out.println("Введите третье число:");
        InputNumbers[2] = Integer.parseInt(sc.next());
        //Переменной присваивается true, если второе число больше первого, а третье больше второго
        Boolean eq = (InputNumbers[1]>InputNumbers[0] && InputNumbers[2]>InputNumbers[1]) ? true : false;
        System.out.println("Результат: "+eq);
    }
}
