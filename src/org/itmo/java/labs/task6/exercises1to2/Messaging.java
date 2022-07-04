package org.itmo.java.labs.task6.exercises1to2;

public interface Messaging {

    StringBuilder incomingMessages = new StringBuilder();
    StringBuilder outcomingMessages = new StringBuilder();

    static void sendMessage(Person addressee, String msgText) {
    }

    static void getMessage(Person sender, String msgText) {
    }


}
