package com.kodilla.exception.nullpointer;

public class MessageSender {
    public void sendMessageTo(User user, String message) throws MessageNotSentException{
        if(user != null) {
            System.out.println("Sending message tp: " + message + ", to user: " + user.getName());
        } else {
            throw new MessageNotSentException("Object User is null");
        }
    }
}
