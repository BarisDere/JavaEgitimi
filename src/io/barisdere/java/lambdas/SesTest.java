package io.barisdere.java.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SesTest {

    public static void main(String[] args) {
//        testEt(new SesVerebilirImpl());
        /*testEt(new SesVerebilir() {
            @Override
            public String sesVer(String ilkSes) {
                System.out.println("Anonymous sessssss");
                return "";
            }
        });*/
        testEt((ilkSes) -> System.out.println(ilkSes + ", Anonymous lambda"));

        List<String> isimler = Arrays.asList("Baris", "Ahmet", "Levent", "Seda", "Kamil");
        isimler.stream()
                .filter(s -> s.startsWith("B"))
//                .map(baska -> baska.toUpperCase())
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static void testEt(SesVerebilir sesVerebilir) {
        sesVerebilir.sesVer("testMethodu");
    }
}
