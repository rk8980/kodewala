package com.kodewala.streamapipractice;

import java.util.Map;
import java.util.stream.Collectors;

public class Driver18 {
    public static void main(String[] args) {

        String str = "programming";

        Map<Character, Long> frequency =
                str.chars()
                   .mapToObj(c -> (char) c)
                   .collect(Collectors.groupingBy(
                           c -> c,
                           Collectors.counting()
                   ));

        System.out.println(frequency);
    }
}