package javaLabs.multiThread;

class Counter {
    int count = 0;

    public void increment() {
        //добавим try-catch на случай прерывания потока
        try {
            count = count + 1;
            System.out.println(count);
        } catch (Exception e) {
            System.out.println("Поток прерван");
        }
    }

    public int getCount() {
        return count;
    }



}

/**
 * Напишите программу, в которой запускается 100 потоков, каждый из которых
 * вызывает метод increment() 1000 раз.
 * После того, как потоки завершат работу count должен быть равен 100000 при  каждом запуске программы .
 * Если обнаружилась проблема, предложите ее решение.
 */
class CounterThread extends Thread {
    private Thread t;
    private String threadName;
    Counter counter;

    CounterThread(String name, Counter co) {
        threadName = name;
        counter = co;
    }

    public void run() {
        synchronized (counter) {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
        System.out.println("Поток " + threadName + "завершается");
    }

    public void start() {
        System.out.println("Запуск потока " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class CountingThreads {


    public static void main(String[] args) {

        Counter count1 = new Counter();

        for (int i = 0; i < 100; i++) {
            CounterThread t1 = new CounterThread("поток" + i, count1);
            t1.start();
            try {
                t1.join();
            } catch (InterruptedException ie) {
                System.out.println("Поток "+ t1.getName() + " прерван");
            }
        }
    }
}