package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movies = movieStore.getMovies();
        List<String> result = movies.entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.toList());

        String moviesList = result.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("! "));

        System.out.println(moviesList + "!");
    }
}
