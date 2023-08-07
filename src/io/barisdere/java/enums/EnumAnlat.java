package io.barisdere.java.enums;

public class EnumAnlat {

    public enum Gunler {
        PAZARTESI(1),
        SALI(2),
        CARSAMBA(3),
        PERSEMBE(4),
        CUMA(5),
        CUMARTESI(6),
        PAZAR(7);

        private final int id;

        Gunler(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public boolean haftaSonumu() {
            return (this == CUMARTESI || this == PAZAR);
        }
    }

    public enum MusteriType {
        BIREYSEL, KURUMSAL
    }

    static void musteriMailYolla(int musteriId, MusteriType type) {

    }

    public static void main(String[] args) {
        Gunler bugun = Gunler.PAZAR;
        System.out.println(bugun.haftaSonumu());
        System.out.println(bugun.getId());
        Gunler gun = Gunler.valueOf("PAZARTESI");
        System.out.println(gun);
        Gunler[] gunler = Gunler.values();
        for (Gunler gun2 : gunler) {
            System.out.println(gun2);
        }
    }
}
