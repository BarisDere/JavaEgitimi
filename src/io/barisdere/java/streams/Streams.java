package io.barisdere.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> texts = Arrays.asList("986", "123", "6", "28", "9", "876");

        var integers = texts.stream()
                .map(Integer::valueOf)
                .filter(Streams::ellidenKucuk)
                .sorted()
                .toList();
//                .forEach(nr -> System.out.println("Sayi Streams: " + nr));


    }

    public static boolean ellidenKucuk(Integer sayi) {
        return sayi < 50;
    }
}
