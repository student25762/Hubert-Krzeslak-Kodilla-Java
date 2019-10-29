package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) {
//        if(b == 0){
//            throw new ArithmeticException();
//        }
//        return a / b;
        try {
            return a / b;
        } catch (ArithmeticException e){
            System.out.println("Divide by ZERO is not allowed!");
        } finally {
            System.out.println("End of program");
        }
        return 0;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
