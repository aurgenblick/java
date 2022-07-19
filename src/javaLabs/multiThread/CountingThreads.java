package javaLabs.multiThread;

class Counter {

    int count = 0;

    public void increment() {
        //добавим try-catch на случай прерывания треда
        try {
            count = count + 1;
            System.out.println(count);
        } catch (Exception e) {
            System.out.println("тред прерван");
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

//создаем класс для треда, который при запуске 1000 раз вызывает метод increment()
class CounterThread extends Thread {
    //в качестве полей класса задаем тред, его имя и счетчик
    private Thread t;
    private String threadName;
    Counter counter;

    CounterThread(String name, Counter co) {
        threadName = name;
        counter = co;
    }

    //в методе run реализуем вызов incremet у переданного в конструктор объекта
    @Override
    public void run() {
        //для последовательного вызова используем ключевое слово synchronized
        synchronized (counter) {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
        //для наглядности сигнализируем в консоли о завершении треда
        System.out.println(threadName + " завершается");
    }

    @Override
    public void start() {
        System.out.println("запуск треда " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class CountingThreads {


    public static void main(String[] args) {
        //чтобы в итоге получалось 100000, надо вызывать метод у того же объекта
        // последовательно несколькими тредами
        Counter count1 = new Counter();
        //запускаем 100 тредов
        for (int i = 0; i < 100; i++) {
            CounterThread t1 = new CounterThread("тред" + i, count1);
            t1.start();
            try {
                //дожидаемся завершения потока
                t1.join();
            } catch (InterruptedException ie) {
                System.out.println("тред " + t1.getName() + " прерван");
            }
        }
    }
}