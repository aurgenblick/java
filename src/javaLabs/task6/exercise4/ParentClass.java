package javaLabs.task6.exercise4;
/*4.	Создайте два класса: главный и класс-наследник.

В главном классе:
●	создайте поле для ввода целого числа;

В классе-наследнике:
●	метод для вывода переменной из главного класса.

Создайте объект на основе класса наследника и выведите через метод переменную с главного класса.
*/

import java.util.Scanner;
//главный класс
class ParentClass {
    //поле для ввода целого числа
    int field;

    //сеттер
    public void setField() {
        Scanner input = new Scanner(System.in);
        this.field = input.nextInt();
    }

    //геттер
    public int getField() {
        return field;
    }
}

//класс-наследник
class ChildClass extends ParentClass {

    @Override
    public void setField() {
        super.setField();
    }

    @Override
    public int getField() {
        return super.getField();
    }

    //метод для вывода переменной из главного класса
    public void showField() {
        System.out.println(this.getField());
    }

    public static void main(String[] args) {
        /*Создайте объект на основе класса наследника и выведите через метод переменную с главного класса.
         */
        ChildClass childObject = new ChildClass();
        childObject.showField();
    }

}
