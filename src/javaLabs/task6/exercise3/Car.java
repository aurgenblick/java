package javaLabs.task6.exercise3;

/*3.	Есть класс автомобиль.
Ниже приведен весь код для главного класса Автомобиль:
*/
public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;


    public void outPut () {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

    public Car (int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car () {}
}

/**Добавьте класс Грузовик, который будет наследовать все от класса Автомобиль.
В классе Грузовик создайте поля:
●	количество колес;
●	максимальный вес.
*/
class Truck extends Car {

    protected int numberOfWheels;
    protected double maxWeight;

    /*Также создайте метод newWheels, который устанавливает новое значение
    в поле «количество колес» и выводит его в консоль.
    */
    public void newWheels (int wheels) {
        this.numberOfWheels = wheels;
        System.out.println(numberOfWheels);
    }

/**В класс Грузовик сделайте конструктор, устанавливающий все значения
в конструктор главного класса и все значения в класс Грузовик. */

    public Truck(int w, String m, char c, float s, int numberOfWheels, double maxWeight) {
        super(w, m, c, s);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }
}
