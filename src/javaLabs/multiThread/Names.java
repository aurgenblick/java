package javaLabs.multiThread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Names extends Thread {

    public static final Object monitor = new Object();
    public static List<String> names = new ArrayList<>();
    public static int n = 0;
    public static String prevName;
    public String threadName;

    public void setNames(String nm) {
        names.add(nm);
    }

    public String getName(int i) {
        return names.get(i);
    }

    public Names(String inputName) {
        names.add(this.threadName = inputName);
        if (prevName == null) {
            prevName = names.get(0);
        }
        if (names.size() >= 2) {
            expandNames();
        }
    }

    public void expandNames() {
        if (n == (names.size() - 1)) {
            n = 0;
        } else {
            n++;
        }
    }


    public void printName() {
        synchronized (monitor) {
            try {
                while (true) {
                    while (!prevName.equals(this.threadName)) {
                        monitor.wait();
                    }
                    System.out.println(this.threadName);
                    prevName = names.get(n);
                    expandNames();
                    monitor.notifyAll();
                }
            } catch (InterruptedException ie) {
                System.out.println("Поток прерван");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество потоков: ");
        int threadsNumber = Integer.parseInt(sc.nextLine()); //!! нужно делать parseInt,
        // чтобы перенос строки не считывался как имя
        Names[] threadNames = new Names[threadsNumber];
        Thread[] printingThreads = new Thread[threadsNumber];
        for (int i = 0; i < threadsNumber; i++) {
            System.out.println("Введите имя треда: ");
            threadNames[i] = new Names (sc.nextLine());
            printingThreads[i] = new Thread(threadNames[i] :: printName);
        }
        Arrays.stream(printingThreads).forEach(Thread::start);
    }
}