package javaLabs.task6.exercises1to2;
/*1.	Абстрактные классы
Создайте несколько классов:
●	абстрактный класс Человек;
●	класс Клиент;
●	класс Работник банка
*/


/*В класс Человек добавьте:
●	поля: имя, фамилия;
●	метод для получение имени;
●	метод для получение фамилии;
●	абстрактный метод для вывода всей информации;
●	конструктор для установки значений.
*/


/*2.	Интерфейсы
Подумайте над тем, как можно использовать интерфейсы в связке с предыдущим заданием.
*/
//Абстрактный класс Человек, имеющий поля имя, фамилия
public abstract class Person implements Messaging {
    private String name;
    private String surname;

    //метод для получения имени
    public String getName() {
        return name;
    }

    //метод для получения фамилии
    public String getSurname() {
        return surname;
    }

    //абстрактный метод для вывода всей информации
    public abstract void showInfo();

    //конструктор для установки значений
    protected Person(String nameToSet, String surnameToSet) {
        this.name = nameToSet;
        this.surname = surnameToSet;
    }

    public abstract void sendMessage(Person addressee, String msgText);

    public abstract void getMessage(Person sender, String msgText);
}
