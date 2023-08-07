package io.barisdere.java.oo.temel.polymorphism;

public class Barinak {

    void sesCikar(Hayvan hayvan) {
        hayvan.sesCikar();
    }
}

class Hayvan {

    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public Hayvan() {
    }

    public String getIsim() {
        return isim;
    }

    void sesCikar() {
         System.out.println("Hayvan sesi");
     }
}

class Kopek extends Hayvan {

    public Kopek() {
        super("Hello");
    }

    @Override
    void sesCikar() {
        System.out.println("Hav hav");
    }
}

class Kedi extends Hayvan {
    @Override
    void sesCikar() {
        System.out.println("Miauw");
    }
}

class Koyun extends Hayvan {
    @Override
    void sesCikar() {
        System.out.println("Meee");
        super.sesCikar();
    }
}
class Civciv extends Hayvan {
    @Override
    void sesCikar() {
        System.out.println("Cik cik");
    }
}

