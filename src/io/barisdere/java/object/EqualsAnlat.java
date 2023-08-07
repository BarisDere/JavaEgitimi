package io.barisdere.java.object;

import java.util.Objects;

public class EqualsAnlat {

    private int id;
    private String isim;

    public EqualsAnlat(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsAnlat that = (EqualsAnlat) o;
        return id == that.id && isim.equals(that.isim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isim);
    }

    public static void main(String[] args) {
        EqualsAnlat anlat1 = new EqualsAnlat(10, "Baris Dere");
        EqualsAnlat anlat2 = new EqualsAnlat(10, "Baris Dere");
        EqualsAnlat anlat3 = anlat1;

        System.out.println("Ayni mi? -> " + (anlat1 == anlat3));
        System.out.println("Ayni mi? -> " + (anlat1 == anlat2));
        System.out.println("Ayni mi? -> " + (anlat1.equals(anlat2)));
    }
}
