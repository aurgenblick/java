package org.itmo.java.labs.task7;

/**
 * 1.	Создайте класс Самолет. В классе создайте вложенный класс крыло. Внутри класса Крыло реализуйте:
 * - поле для хранения информации про вес крыла;
 * - метод, что будет показывать вес крыла.
 * 2.	Выполните предыдущее задание. В главном классе создайте объект и добавьте во вложенный класс
 * данные про вес крыла, а также выведите информацию на экран.
 * Создайте два объекта и добавьте разный вес для крыльев.
 */
public class Aircraft {

    String model;
    Wing wing;

    public Aircraft(String model) {
        wing = new Wing();
        this.model = model;
    }

    //вложенный класс Крыло
    class Wing {
        //поле для хранения информации про размах крыла
        double wingSpan;

        //сеттер
        public void setWingSpan(double wingSpan) {
            this.wingSpan = wingSpan;
        }

        //метод вложенного класса, показывающий размах крыла
        void wingInfo() {
            System.out.println(this.wingSpan);
        }
    }

    public static void main(String[] args) {

        //создание объекта в главном классе
        Aircraft aircraft1 = new Aircraft("AirbusA320");
        Aircraft aircraft2 = new Aircraft("Boeing777-8");

        //добавление во вложенный класс данных про вес крыла и вывод их в консоль
        aircraft1.wing.setWingSpan(34.1);
        aircraft2.wing.setWingSpan(78.1);

    }

}
