package javaLabs.multiThread;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameThreads implements Runnable {
    /**
     * Напишите программу, в которой создаются два потока, каждый из которых выводит
     * по очереди на консоль своё имя.
     * Начать можно с написания своего класс-потока, который выводит в бесконечном
     * цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и
     * notify().
     */
    private String threadName;
    private static final Object monitor = new Object();

    public NameThreads(String threadName) {
        this.threadName = threadName;
    }

    //зададим переменную для вызова wait и notify
    boolean flag = false;

    //в методе run реализуем вывод имени потока
    @Override
    public void run() {
        while (true) {
            synchronized (monitor) {
                if (!flag) {
                    System.out.println("Имя треда: " + Thread.currentThread().getName());
                    flag = true;
                    notify();
                } else {
                    synchronized (monitor) {
                        flag = false;
                        try {
                            wait();
                        } catch (InterruptedException ie) {
                            ie.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество имен: ");
        Integer threadsNumber = sc.nextInt();
        String[] names = new String[threadsNumber];
        NameThreads[] pool = new NameThreads[threadsNumber];
        for (int i = 0; i < threadsNumber; i++) {
            System.out.println("Введите имя треда: ");
            names[i] = sc.nextLine();
//            pool[i] =
                    new NameThreads(names[i]);
        }
//        for (int i = 0; i < threadsNumber; i++) {
//            pool[i].start();
//        }
    }
}
