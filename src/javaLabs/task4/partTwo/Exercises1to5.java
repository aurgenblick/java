package javaLabs.task4.partTwo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercises1to5 {
    // Метод, проверяющий отсортирован ли массив по возрастанию
    private static String isSorted(Integer[] a) {
        String notSorted = "OK";
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                notSorted = "Please try again";
                break;
            }
        }
        return notSorted;
    }

    //Метод, считывающий длину массива
    private static Integer setLength() {
        System.out.println("Array length: ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.next());
    }

    //Метод, создающий массив с заданной длиной и элементами
    private static Integer[] createArray() {
        System.out.println("Array length: ");
        Scanner sc = new Scanner(System.in);
        Integer len = Integer.parseInt(sc.next());
        Integer[] newArray = new Integer[len];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < len; i++) {
            newArray[i] = Integer.parseInt(sc.next());
        }
        return newArray;
    }

    // Метод, меняющий местами первый и последний элементы массива
    private static void swapFirstLast(Integer[] arr) {
        System.out.println(Arrays.toString(arr));
        Integer first = arr[0];
        Integer last = arr[arr.length - 1];
        arr[0] = last;
        arr[arr.length - 1] = first;
        System.out.println(Arrays.toString(arr));
        ;
    }

    // Метод, выводящий первое уникальное число, входящее в массив
    public static void findUnique(Integer[] inputArr) {
        Integer[] counter = new Integer[inputArr.length];
        int arrNum;
        int count;
        for (int j = 0; j < inputArr.length; j++) {
            arrNum = inputArr[j];
            count = 0;
            for (int k = 0; k < inputArr.length; k++) {
                if (arrNum == inputArr[k]) {
                    count++;
                }
            }
            counter[j] = count;
        }

        for (int m = 0; m < counter.length; m++) {
            if (counter[m] == 1) {
                System.out.println("В массиве " + Arrays.toString(inputArr) + " первое уникальное число - это " + inputArr[m]);
                break;
            }
        }
    }

    // Метод, создающий массив псевдослучайной длины в пределах 17 и наполняющий его псевдослучайными числами диапазона [0 ; 200)
    private static Integer[] createRandomArray () {
        Random r = new Random();
        Integer arrLength = 2 + r.nextInt(15);
        Integer[] randomArray = new Integer[arrLength];
        for (int i=0; i < randomArray.length; i++) {
            randomArray[i] = r.nextInt(200);
        }
        return randomArray;
    }

    public static void main(String[] args) {

        // Проверка, отсортирован ли массив в порядке возрастания
        Integer[] array1 = {12, 33, 12, 23, 44};
        Integer[] array2 = {14, 15, 14, 17, 15};
        System.out.println("Array : " + Arrays.toString(array1));
        System.out.println(isSorted(array1));
        System.out.println("Array : " + Arrays.toString(array2));
        System.out.println(isSorted(array2));

        // Программа, считывающая из консоли длину массива и вводимые элементы массива и выводит элементы массива построчно
        Integer[] array3 = createArray();
        System.out.println("Result: " + Arrays.toString(array3));

        // Использование метода, который меняет местами первый и последний элементы массива
        System.out.println("\nSwitching first and last elements' positions");
        swapFirstLast(array1);
        swapFirstLast(array2);
        swapFirstLast(array3);

        // Использование метода, находящего первое уникальное число в массиве
        findUnique(array1);
        findUnique(array2);
        findUnique(array3);

        // Наполнение массива случайными числами
        Integer[] randArray1 = createRandomArray();
        System.out.println("\nRandom array: "+Arrays.toString(randArray1));


    }
}

