package io.barisdere.java.newfeatures;

public class PatternMatchingAnlat {

    interface Sekil {}
    record Dikdortgen(double genislik, double yukseklik) implements Sekil {}
    record Cember(double yaricap) implements Sekil {}

    public static void main(String[] args) {
        Sekil sekil = birSekilVer();

        if (sekil == null) {
            System.out.println("Sekil null");
        } else if (sekil instanceof Dikdortgen dikdortgen) {
            System.out.println("Genislik: " + dikdortgen.genislik() + ", yukseklik: " + dikdortgen.yukseklik());
        } else if (sekil instanceof Cember cember) {
            System.out.println("yaricap: " + cember.yaricap());
        } else {
            System.out.println("Taninmayan sekil");
        }

        switch (sekil) {
            case null -> System.out.println("Sekil null");
            case Dikdortgen(double g, double y) -> System.out.println("Genislik: " + g + ", yukseklik: " + y);
            case Cember(double y) -> System.out.println("yaricap: " + y);
            default -> System.out.println("Taninmayan sekil");
        }

    }

    private static Sekil birSekilVer() {
        return null;
    }

}
