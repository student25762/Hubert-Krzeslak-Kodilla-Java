package com.kodilla.exception.nullpointer;

public class MessageSender {
    public void sendMessageTo(User user, String message){
        System.out.println("Sending message tp: " + message + ", to user: " + user.getName());
    }
}
