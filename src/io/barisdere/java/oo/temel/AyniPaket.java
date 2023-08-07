package io.barisdere.java.oo.temel;

public class AyniPaket {

    public static void main(String[] args) {
        Ulasim u1 = new Ulasim();
        u1.textPublic = "";
        u1.printPublic();
        u1.textProtected = "";
        u1.printProtected();
        u1.textDefault = "";
        u1.printDefault();

    }
}
