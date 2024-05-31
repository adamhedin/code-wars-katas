package org.example.codewarskatas;

import java.util.stream.Collectors;

public class DuplicateEncoder {
    static String encode(String word){
        return word.toLowerCase().chars()
                .mapToObj(ch -> (char)ch)
                .map(w -> word.toLowerCase().chars().filter(c -> c ==  w).count() > 1 ? ")" : "(")
                .collect(Collectors.joining (""));
    }
}
