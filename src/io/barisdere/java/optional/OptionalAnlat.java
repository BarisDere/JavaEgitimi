package io.barisdere.java.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalAnlat {

    public static void main(String[] args) {
        Optional<String> value = findValue(8);

        value.ifPresent(s -> System.out.println(value.get().toLowerCase()));

        String alternatifDeger = value.orElse("AlternatifDeger");
        String s = value.orElseThrow();
        Optional<String> first = value.stream().findFirst();

    }

    public static Optional<String> findValue(int id) {
        return Optional.ofNullable("@BarisDere");
    }
}
