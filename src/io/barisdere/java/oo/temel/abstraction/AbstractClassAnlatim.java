package io.barisdere.java.oo.temel.abstraction;

public class AbstractClassAnlatim {

    public static void main(String[] args) {
        AC b1 = new B();
        b1.getMessage();
        b1.sayi = 90;
    }
}

class B extends AC {

    @Override
    String getMessage() {
        return "M1";
    }
}

abstract class AC2 {

}

abstract class AC {
    protected int sayi = 10;

    abstract String getMessage();

    void print() {

    }


}