package io.barisdere.java.errors;

public class MusteriAktifDegilException extends RuntimeException {

    private int id;

    public MusteriAktifDegilException(int id) {
        super("Musteri " + id + " aktif degil");
    }
}
