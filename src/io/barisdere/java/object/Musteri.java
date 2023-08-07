package io.barisdere.java.object;

public class Musteri {
    private int id;
    private String isim;

    public Musteri(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Musteri musteri1 = new Musteri(1, "Baris");
        Musteri musteri2 = new Musteri(2, "Dere");
        System.out.println(musteri1);
        System.out.println(musteri2);
    }
}
