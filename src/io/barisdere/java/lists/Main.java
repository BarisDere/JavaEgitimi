package io.barisdere.java.lists;

public class Main {

    public static <T> T print(T value) {
        System.out.println(value);
        return value;
    }

    public static void main(String[] args) {
        Pair<Integer, Integer> integerPair = new Pair<>(123, 456);
        System.out.println("F:" + integerPair.getFirst() + ", S:" + integerPair.getSecond());
        Pair<Double, Double> doublePair = new Pair<>(12.3, 45.6);
        System.out.println("F:" + doublePair.getFirst() + ", S:" + doublePair.getSecond());
        Pair<String, Integer> stringPair = new Pair<>("Bir", 1234);
        System.out.println("F:" + stringPair.getFirst() + ", S:" + stringPair.getSecond());

        print("BarisDere");
        print(new Pair<String, Integer>("", 1));
    }
}
