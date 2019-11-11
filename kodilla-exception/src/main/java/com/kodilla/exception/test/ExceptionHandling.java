package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public void handling() throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        try{
            secondChallenge.probablyIWillThrowException(2,3);
        } catch (Exception e){
            System.out.println("Not valid numbers");
        } finally {
            System.out.println("End of exception");
        }
    }
}
