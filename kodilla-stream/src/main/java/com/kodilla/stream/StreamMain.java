package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.net.FileNameMap;

public class StreamMain {
    public static void main(String []args) {
        System.out.println("Welcome to module 7 - Stream");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("This is an example text", textToDecorate -> textToDecorate.toUpperCase());
        poemBeautifier.beautify("This is an example text", textToDecorate -> "ABC " + textToDecorate + " ABC");
        poemBeautifier.beautify("This is an example text", textToDecorate -> textToDecorate.replace("s", "$"));
        poemBeautifier.beautify("This is an example text", textToDecorate -> textToDecorate.toLowerCase());

    }
}
