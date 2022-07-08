package org.itmo.java.labs.task9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercise2 {

    //метод, добавляющий 1млн значений элементов
    public static void addMillion(List<Integer> inputList) {
        for (int i = 0; i < 1000000; i++) {
            inputList.add(i);
        }
    }

    //метод, выбирающий из заполненного списка элемент наугад 1000000 раз
    public static Runnable chooseRandom(List<Integer> inputList) {
        for (int i = 0; i < 10000; i++) {
            inputList.get((int) (Math.random() * inputList.size()));
        }
        return null;
    }

    //метод, считающий время выполнения другого метода
//    public static void timer (Runnable method) {
//        long startTime = System.currentTimeMillis();
//        method.run();
//        System.out.println("Execution time is "+(System.currentTimeMillis() - startTime);
//    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();

        //добавляем элементы в каждую из коллекций
        addMillion(array);
        addMillion(linked);

        //
//        timer(chooseRandom(array));
//        timer(chooseRandom(linked));

        //замеряем время выполнения и выводим на экран
        long time1 = System.currentTimeMillis();
        chooseRandom(array);
        long time2 = System.currentTimeMillis();
        System.out.println("Execution time for ArrayList is "+ (time2-time1));
        long time3 = System.currentTimeMillis();
        chooseRandom(linked);
        long time4 = System.currentTimeMillis();
        System.out.println("Execution time for LinkedList is "+ (time4-time3));
    }
}
