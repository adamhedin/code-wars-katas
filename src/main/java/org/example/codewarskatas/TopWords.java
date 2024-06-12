package org.example.codewarskatas;
import java.util.*;
import java.util.stream.Collectors;


public class TopWords {
    public static List<String> top3(String s) {
         Arrays.stream(s.split(" ")).distinct()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                 .limit(3)
                .forEach(System.out::println);
         return new ArrayList<>();
    }
}
