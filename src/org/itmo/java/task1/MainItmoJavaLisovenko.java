package org.itmo.java.task1;

import java.util.Scanner;

public class MainItmoJavaLisovenko {
    public static void main(String[] args) {
        //      Task #1
        System.out.println("Task #1");
        String i = "Я";
        String k = "знаю";
        String j = "Java";
        String w = "хорошо.";
        String string = i + "\n" + k + "\n" + j + "\n" + w;
        System.out.println(string);
//      Task #2
        System.out.println("Task #2");
        System.out.println((46 + 10) * (10 / 3.0));
        System.out.println(29 * 4 * (-15));
//      Task #3
        System.out.println("Task #3");
        double number = 100500;
        double result3 = ((number / 10) / 10);
        System.out.println(result3);
//      Task#4
        System.out.println("Task #4");
        double num1 = 3.6;
        double num2 = 4.1;
        double num3 = 5.9;
        double result4 = num1 * num2 * num3;
        System.out.println(result4);
//      Task#5
        System.out.println("Task #5");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(n1 + "\n" + n2 + "\n" + n3);
//      Task#6
        System.out.println("Task #6");
        int b = sc.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечётное");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Чётное");
        }
    }
}
