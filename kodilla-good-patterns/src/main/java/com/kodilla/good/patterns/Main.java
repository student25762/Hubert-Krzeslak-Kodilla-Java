package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.*;

public class Main {
    public static void main(String[] args){
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().forEach((String s) -> System.out.println(s);
    }
}
