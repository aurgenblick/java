package org.itmo.java.labs.task6.exercise5;

import java.util.Scanner;

/**5.	Создайте главный класс. Добавьте в него:
●	метод для получения возраста пользователя;
*/
class Person {

    int age;
    String name;
    Scanner scanner = new Scanner(System.in);

    public int getAge() {
        return age;
    }

    //(сеттер) метод для получения возраста пользователя
    public void setAge() {
        this.age = scanner.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName() {}

}

/**Создайте класс-наследник. Добавьте в него:
●	переопределенный метод для получения имени пользователя;
*/

class User extends Person {

    //переопределенный метод для получения имени пользователя
    @Override
    public void setName() {
        System.out.println("Enter name :");
        this.name = super.scanner.nextLine();
    }

    public static void main(String[] args) {
        //создайте объект на основе класса-наследника
        User user = new User();
        //используйте для объекта метод из класса
        user.setName();
        //проверка результата работы вызванного метода
        System.out.println(user.getName());

    }
}
