package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movies = movieStore.getMovies();
        List<String> result = movies.values().stream()
                .flatMap(s -> s.stream().

    }
}
