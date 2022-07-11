//package org.itmo.java.labs.questions;
//
//public class Exercise1 {
//}
//package org.itmo.java.labs.task4.partTwo;
//
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//import static java.lang.System.*;
//
//
//public class Exercise1 {
//
//    protected int arrLength;
//    protected Integer[] array;
//
//    //Метод для задания длины массива из консоли
//
//    public int setArrayLength(int len) {
//        arrLength = len;
//        return arrLength;
//    }
//
//    //Конструктор по умолчанию
//    public Exercise1() {
//    }
//
//    // Конструктор, наполняющий массив псевдослучайными числами диапазона [0 ; 200)
////    public Exercise1 () {
////        arrLength = 2 + Random.nextInt(15);
////        array = new Integer[arrLength];
////        for (Integer i : array) {
////            array[i] = Random.nextInt(200);
////        }
////    }
//
//    //Перегруженный конструктор для наполнения массива числами из консоли
//    public Exercise1(int enteredLength) {
//        array = new Integer[enteredLength];
//        out.println("Введите " + array.length + " чисел массива");
//        Scanner sc = new Scanner(in);
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//        }
//    }
//
//    public static void main(String[] args) {
//
////Задание 1: создаем объекты класса с рандомно наполненным массивом и проверяем, отсортирован ли объект-массив
//        Exercise1 ex1 = new Exercise1();
//        ex1.array = new Integer[]{12,33,23,56,77,32};
//        out.println("Array: " + Arrays.toString(ex1.array));
//        int j = 0;
//        boolean isSorted = false;
//        while (j < ex1.array.length - 1) {
//            int c = ex1.array[j+1];
//            int d = ex1.array[j];
//            if (c < d) {
//                isSorted = true;
//                break;
//            } else {
//                j++;
//            }
//        }
//        out.println(isSorted);
//
//        Exercise1 ex2 = new Exercise1();
//        ex2.array = new Integer[]{12, 13, 15, 16, 17, 18};
//        out.println("Array: " + Arrays.toString(ex2.array));
//        int k = 0;
//        boolean isSorted2 = false;
//        while (k < ex2.array.length - 1) {
//            int a = ex2.array[k+1];
//            int b = ex2.array[k];
//            if (a < b) {
//                isSorted = true;
//                break;
//            } else {
//                k++;
//            }
//        }
//        out.println(isSorted);
//
//
//////Задание 2: Длину и наполнение массива задаем из консоли
////        int[] intArray2;
////        intArray2 = setArrayLength();
//
//    }
//}
//
