package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public void handling() throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        secondChallenge.probablyIWillThrowException(4,9);
    }
}
