package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        // System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calculator = new Calculator();
        int calculatorAddResult = calculator.add(2,2);
        int calculatorSubtract = calculator.subtract(2,2);

        if((calculatorAddResult == 4) && (calculatorSubtract == 0)){
            System.out.println("Test ok");
        } else {
            System.out.println("Something is wrong");
        }
    }
}
