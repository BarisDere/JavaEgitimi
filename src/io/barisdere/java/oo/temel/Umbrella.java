package io.barisdere.java.oo.temel;

public class Umbrella {

    String renk;
    int genislik;
    int uzunluk;

    public Umbrella() {
    }

    public Umbrella(String renk, int genislik, int uzunluk) {
        this.renk = renk;
        this.genislik = genislik;
        this.uzunluk = uzunluk;
    }

    public static void main(String[] args) {
        Umbrella umbrella1 = new Umbrella();
        System.out.println("Renk: " + umbrella1.renk);

        Umbrella umbrella2 = new Umbrella("red", 120, 110);
        System.out.println("Renk: " + umbrella2.renk);
    }

}
