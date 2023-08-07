package io.barisdere.java.errors;

import java.util.ArrayList;

public class OutOfMemoryTest {

    public static void main(String[] args) {
        var list = new ArrayList<>();
        while (true) {
            byte[] b = new byte[1048576];
            list.add(b);
        }
    }
}
