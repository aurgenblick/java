package javaLabs.multiThread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadsExample {

    /**
     * Напишите программу, в которой запускается 10 потоков и каждый из них выводит
     * //числа от 0 до 100.
     * //Выведете состояние потока перед его запуском, после запуска и во время
     * //выполнения.
     */

    //создаем класс запускаемых заданий для потоков
    private static class Counter1 implements Runnable {
        //чтобы в дальнейшем потоки начали отсчёт одновременно, создадим элемент типа barrier
        private CyclicBarrier barrier;

        //конструктор с заданием барьера
        public Counter1(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        //переопределяем run с использованием метода wait барьера
        @Override
        public void run() {
            try {
                System.out.printf("Создан новый поток.%n");
                //Для указания потоку о том что он достиг барьера, нужно вызвать метод await()
                //После этого данный поток блокируется, и ждет пока остальные потоки достигнут барьера
                barrier.await();
                //когда заданное количество потоков достигло барьера, они разлочиваются и переходят к выполнению метода run далее
                System.out.println(Thread.currentThread().getName() + " выполняет вывод: ");
                //будут выводиться числа от 0 до 100
                int i = 0;
                while (i < 101) {
                    //чтобы видеть, какой поток вывел число, выводим дополнительно имя потока
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    i++;
                }

            } catch (InterruptedException | BrokenBarrierException ex) {
                System.out.println(ThreadsExample.class.getName() + " " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {

        //создаем барьер типа CyclicBarrier с 10 потоками, которым необходимо вызвать await(), чтобы пройти барьер
        final CyclicBarrier cBarrier = new CyclicBarrier(10, new Runnable() {
            @Override
            public void run() {
                //после того, как все потоки достигнут барьера, будет выдано сообщение
                System.out.println("Все потоки достигли барьера, начать отсчёт");
            }
        });

        Thread count1 = new Thread(new Counter1(cBarrier), "Поток 1");
        Thread count2 = new Thread(new Counter1(cBarrier), "Поток 2");
        Thread count3 = new Thread(new Counter1(cBarrier), "Поток 3");
        Thread count4 = new Thread(new Counter1(cBarrier), "Поток 4");
        Thread count5 = new Thread(new Counter1(cBarrier), "Поток 5");
        Thread count6 = new Thread(new Counter1(cBarrier), "Поток 6");
        Thread count7 = new Thread(new Counter1(cBarrier), "Поток 7");
        Thread count8 = new Thread(new Counter1(cBarrier), "Поток 8");
        Thread count9 = new Thread(new Counter1(cBarrier), "Поток 9");
        Thread count10 = new Thread(new Counter1(cBarrier), "Поток 10");
        count1.start();
        count2.start();
        count3.start();
        count4.start();
        count5.start();
        count6.start();
        count7.start();
        count8.start();
        count9.start();
        count10.start();
    }

}



