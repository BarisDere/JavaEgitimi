package io.barisdere.java.variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        boolean aySonuGeldimi = false;
        byte yasKac = 127;
        short gunSayisi = 450;
        int mesafeKm = 578594;
        long birLongOrnegi = 65_479_645_796_564L;

        float dereceSicaklik = 28.46f;
        double ucret = 500_000_000.7895479754;

        System.out.println(aySonuGeldimi);
        System.out.println(yasKac);
        System.out.println(gunSayisi);
        System.out.println(mesafeKm);
        System.out.println(birLongOrnegi);
        System.out.println(dereceSicaklik);
        System.out.println(ucret);

        //region char veri tipi
        char aHarfiUnicode = '\u0041';
        char aHarfiKarakter = 'A';
        char aHarfiSayisalKodlama = 65;

        System.out.println(aHarfiUnicode);
        System.out.println(aHarfiKarakter);
        System.out.println(aHarfiSayisalKodlama);
        //endregion
    }
}
