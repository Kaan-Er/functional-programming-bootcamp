package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import java.util.List;

public class Practise4 {

    public List<String> orderByLength(List<String> strings, boolean decreasing) {
        // TODO: implement method that accepts list of strings and a boolean which indicates order way
        // TODO: returns them ordering by their length.

        return strings.stream()
                .sorted((string1, string2) -> {
                    if (decreasing) {
                        return string2.length() - string1.length();
                    } else {
                        return string1.length() - string2.length();
                    }
                })
                .toList();
    }
}
