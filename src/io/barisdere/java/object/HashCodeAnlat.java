package io.barisdere.java.object;

import java.util.Objects;

public class HashCodeAnlat {

    private int id;

    public HashCodeAnlat(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCodeAnlat that = (HashCodeAnlat) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        HashCodeAnlat hash1 = new HashCodeAnlat(5);
        HashCodeAnlat hash2 = new HashCodeAnlat(5);
        HashCodeAnlat hash3 = hash2;

        System.out.println(hash1.equals(hash2));
        System.out.println(hash1.hashCode());
        System.out.println(hash2.hashCode());
        System.out.println(hash3.hashCode());
    }
}
