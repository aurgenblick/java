package org.itmo.java.labs.task6.exercises1to2;

/*В класс Клиент добавьте:
●	наследование класса Человек;
●	реализация функции для вывода информации;
●	строковое поле «название банка»;
●	конструктор для установки всех значений;
*/
//Класс клиент, наследующий класс Человек
public class Client extends Person {

    //строковое поле "название банка"
    private String bankName;

    //конструктор для установки всех значений

    public Client(String nameToSet, String surnameToSet, String bankNameToSet) {
        //вследствие наследование должны также вызвать родительский конструктор
        super(nameToSet, surnameToSet);
        this.bankName = bankNameToSet;
    }

    //реализация функции для вывода информации
    //вследствие наследования от абстрактного класса, дожны выполнять абстрактный метод
    @Override
    public void showInfo() {
        System.out.println("\nИмя клиента: " + this.getName());
        System.out.println("Фамилия клиента: " + this.getSurname());
        System.out.println("Название банка: " + this.bankName);
    }

    @Override
    public void sendMessage(Person addressee, String msgText) {
        System.out.println(OutcomingMessages.append("\nСообщение от " + this.getName() + " для " + addressee.getName() + ": " + msgText));
    }

    @Override
    public void getMessage(Person sender, String msgText) {
        System.out.println(IncomingMessages.append("\nСообщение от " + sender.getName() + " для " + this.getName()  + ": " + msgText));
    }
}
