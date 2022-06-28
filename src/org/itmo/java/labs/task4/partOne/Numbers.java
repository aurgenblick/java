package org.itmo.java.labs.task4.partOne;


class Numbers {

    private static Integer[] allNumbers = new Integer[101];

    private static Integer getNumber(Integer j) {
        return allNumbers[j];
    }

    public static void main(String[] args) {

        //Создание массива с целыми числами от 0 до 100
        for (int i = 0; i <= 100; i++) {
            allNumbers[i] = i;
        }

        /*Пункт 1.
        Вывод чисел массива от 1 до 99, которые являются нечетными
         */

        System.out.println("Нечетные числа 1-99: ");
        Integer[] oddNumbers;
        for (int i = 1; i < allNumbers.length; i++) {
            if (Numbers.getNumber(i) % 2 != 0) {
                System.out.println(Numbers.getNumber(i));
            }
        }

        /*Пункт 2.
        Вывод чисел массива от 1 до 100, которые делятся на 3 */

        System.out.println("Делятся на 3 ");
        for (int i = 1; i < allNumbers.length; i++) {
            if (Numbers.getNumber(i) % 3 == 0) {
                System.out.println(Numbers.getNumber(i));
            }
        }

        //Вывод чисел массива от 1 до 100, которые делятся на 5
        System.out.println("Делятся на 5 ");
        for (int i = 1; i < allNumbers.length; i++) {
            if (Numbers.getNumber(i) % 5 == 0) {
                System.out.println(Numbers.getNumber(i));
            }
        }

        //Вывод чисел массива, которые делятся и на 3, и на 5
        System.out.println("Делятся на 3 и на 5 ");
        for (int i = 1; i < allNumbers.length; i++) {
            if (Numbers.getNumber(i) % 3 == 0 && Numbers.getNumber(i) % 5 == 0) {
                System.out.println(Numbers.getNumber(i));
            }
        }
    }
}
