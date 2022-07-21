package javaLabs.multiThread;

import java.util.Arrays;
import java.util.Scanner;

public class NameThreads extends Thread {
    /**
     * Напишите программу, в которой создаются два потока, каждый из которых выводит
     * по очереди на консоль своё имя.
     * Начать можно с написания своего класс-потока, который выводит в бесконечном
     * цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и
     * notify().
     */

    private static final Object monitor = new Object();

    //зададим переменную для вызова wait и notify
    boolean flag = false;

    //конструктор, который задает имя потока и запускает его
    public NameThreads(String name) {
        this.setName(name);
        //this.start();
    }

    //в методе run реализуем вывод имени потока
    @Override
    public void run() {
        synchronized (monitor) {
            while (true) {
                if (!flag) {
                    System.out.println("Имя треда: " + Thread.currentThread().getName());
                    flag = true;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    monitor.notifyAll();
                } else {
                    flag = false;
                    try {
                        monitor.wait();
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Введите количество имен: ");
        int threadsNumber = 2;
                //Integer.parseInt(sc.nextLine());
        NameThreads[] threads = new NameThreads[threadsNumber];
        for (int i = 0; i < threadsNumber; i++) {
            System.out.println("Введите имя треда: ");
            threads[i] = new NameThreads(sc.next());
        }
        Arrays.stream(threads).forEach(Thread::start);
    }
}
