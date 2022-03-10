package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TailsGenerator {
    //easy solution

    public List<String> tailsEasySolution(String value) {
        ArrayList<String> wordsContainer = new ArrayList<>(value.length() + 1);
        for (int i = 0; i < value.length() + 1; i++) {
            wordsContainer.add(value.substring(i));
        }
        return wordsContainer;
    }

    //fun with Streams
    public List<String> tails(String value) {
        return IntStream
                .range(0, value.length() + 1)
                .mapToObj(value::substring)
                .collect(Collectors.toList());
    }

}
