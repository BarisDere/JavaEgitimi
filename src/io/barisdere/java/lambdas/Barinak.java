package io.barisdere.java.lambdas;

public class Barinak {

    public static void main(String[] args) {
        Hayvan hayvan  = new Kedi();
//        new Barinak().ses(hayvan);
        switch (hayvan) {
            case Kedi k-> System.out.println("");
            case Koyun k-> System.out.println("d");
            default -> System.out.println("fsfsd");
        }
    }
    void sesCikar(Hayvan hayvan) {
        hayvan.sesCikar();
    }

    void ses(Koyun koyun) {

    }
    void ses(Kedi kedi) {

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
        super("Benim kopegim");
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
        System.out.println("Mee");
        super.sesCikar();
    }
}

class Civciv extends Hayvan {
    @Override
    void sesCikar() {
        System.out.println("Cik cik");
    }
}
