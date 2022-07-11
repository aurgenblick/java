package javaLabs.task6.exercises1to2;

/*В класс Работник банка добавьте:
●	наследование класса Человек;
●	реализация функции для вывода информации;
●	строковое поле «название банка»;
●	конструктор для установки всех значений;
*/
//класс Работник банка, наледующий класс Человек
public class BankEmployee extends Person {

    //строковое поле "название банка"
    private String bankName;

    //конструктор для установки всех значений
    public BankEmployee(String nameToSet, String surnameToSet, String bankNameToSet) {
        //вследствие наследования должны также вызвать родительский конструктор
        super(nameToSet, surnameToSet);
        this.bankName = bankNameToSet;
    }

    //вследствие наследование от абстрактного класса, должны выполнять абстрактный метод
    //реализация функции для вывода информации
    @Override
    public void showInfo() {
        System.out.println("\nИмя: " + this.getName());
        System.out.println("Фамилия: " + this.getSurname());
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
