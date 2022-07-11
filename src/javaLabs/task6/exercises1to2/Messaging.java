package javaLabs.task6.exercises1to2;

public interface Messaging {

    StringBuilder IncomingMessages = new StringBuilder();
    StringBuilder OutcomingMessages = new StringBuilder();

    void sendMessage(Person addressee, String msgText);

    void getMessage(Person sender, String msgText);



}
