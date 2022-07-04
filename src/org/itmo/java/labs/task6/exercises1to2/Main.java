package org.itmo.java.labs.task6.exercises1to2;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client ("Jane", "Doe", "CitiBank");
        client1.showInfo();

        BankEmployee employee1 = new BankEmployee("John", "Smith", "MorganChase");
        employee1.showInfo();

        employee1.sendMessage(client1, "Hello!");

    }
}
