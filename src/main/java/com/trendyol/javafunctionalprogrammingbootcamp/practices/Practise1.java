package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import java.util.List;

public class Practise1 {

    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        // TODO: implement method that accepts list of integers and returns even numbers.
        //  You should use filter method of Stream API.
        //  Example: input: [1, 2, 3, 4, 5, 6] -> output: [2, 4, 6]

        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
    }
}
