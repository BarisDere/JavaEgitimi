package io.barisdere.java.oo.temel.polymorphism;

import io.barisdere.java.oo.temel.polymorphism.*;

public class Main {

    public static void main(String[] args) {
        Hayvan kopek = new Kopek();
        Hayvan kedi = new Kedi();
        Hayvan koyun = new Koyun();
        Civciv civciv = new Civciv();

        Hayvan[] hayvanlar = new Hayvan[]{kopek, kedi, koyun, civciv};

        for (Hayvan hayvan:hayvanlar) {
            hayvan.sesCikar();
        }

//        Barinak barinak = new Barinak();
//        barinak.sesCikar(kopek);
//        barinak.sesCikar(kedi);
//        barinak.sesCikar(koyun);
//        barinak.sesCikar(civciv);
    }
}
