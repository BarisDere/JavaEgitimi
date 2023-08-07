package io.barisdere.java.variables;

public class DataTypesDefaultValues {
    char aHarfiUnicode;
    String kelime;

    public DataTypesDefaultValues() {
    }

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
//        System.out.println(kelime);
//        System.out.println(aHarfiUnicode);
        int sonuc6 = 5 + 10 * 15 / 20;
        int sonuc = (9 - 3) / (2 + 1) * 2;
        double d = 5.2 + 7 + 3.4f;
        System.out.println(sonuc + ", " + sonuc6);

        A a1 = new A(1);
        A a2 = a1;
        System.out.println(a1.a);
        System.out.println(a2.a);

        a2 = new A(5);
        System.out.println(a1.a);
        System.out.println(a2.a);

        String kelime = "Baris Dere";

        switch (kelime) {
            case "Bla":
                System.out.println(" YESS");
                break;
            case "Baris DerE":
                System.out.println(" Baris Dere loo");
                break;

            default:
                System.out.println("Olmadi");
        }

        int sayilar[] = new int[]{4, 1, 9, 7, 8};
        System.out.println(sayilar[99]);
        byte[][] dereceler = {
                {-8, 18},
                {-4, 21},
                {5, 24},
                {4, 30},
                {17, 37},
                {21, 43},
                {20, 48},
                {18, 46},
                {13, 41},
                {11, 32},
                {12, 24},
                {2, 18}
        };
        System.out.println("-->" + dereceler[11][0]);
        int[] numbers =
                {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
        for (int i = 0; i < dereceler.length; i++) {
            for (int j = 0; j < dereceler.length; j++) {
                System.out.print(dereceler[i][j] + ",");
            }
            System.out.println();
        }

        int[][] numbers2 =
                {{1,2},{10,4}};
        


    }

    public static class A {
        public int a;

        public A(int a) {
            this.a = a;
        }
    }
}
