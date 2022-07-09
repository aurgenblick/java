package org.itmo.java.labs.task10;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    /**
     * 1.	Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
     */
    private static void readLinesIntoSet1() {
        System.out.println("Enter path to a text file :");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        try {
            List<String> fileLines = Files.readAllLines(Paths.get(path));
            for (String line : fileLines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //перегрузка сразу с path
    private static void readLinesIntoSet1(String path) {
        try {
            List<String> fileLines = Files.readAllLines(Paths.get(path));
            for (String line : fileLines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //вариант с RandomAccessFile
    private static void readLinesIntoSet2() {
        System.out.println("Enter path to a text file :");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        try {
            RandomAccessFile myFile = new RandomAccessFile(path, "r");
            String fileStr;
            while ((fileStr = myFile.readLine()) != null) {
                System.out.println(fileStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //перегрузка сразу с path
    private static void readLinesIntoSet2(String path) {
        try {
            RandomAccessFile myFile = new RandomAccessFile(path, "r");
            String fileStr;
            while ((fileStr = myFile.readLine()) != null) {
                System.out.println(fileStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**2.	Написать метод, который записывает в файл строку, переданную параметром.*/


    /**3.	Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.*/


    /**
     * 4.	Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’
     */

    public static void main(String[] args) {
        /**1.	Написать метод, который читает текстовый файл и возвращает его в виде списка строк.*/
        readLinesIntoSet1("C:\\Users\\user\\IdeaProjects\\java\\src\\org\\itmo\\java\\labs\\task10\\New Text Document.txt");
    }

}
