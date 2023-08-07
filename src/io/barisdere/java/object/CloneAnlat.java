package io.barisdere.java.object;

public class CloneAnlat implements Cloneable {

    private int id;

    public CloneAnlat(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneAnlat clone1 = new CloneAnlat(1);
        CloneAnlat clone1Kopyasi = (CloneAnlat) clone1.clone();

        clone1Kopyasi.setId(5);

        System.out.println(clone1);
        System.out.println(clone1Kopyasi);

        System.out.println("====Degerler=====");
        System.out.println(clone1.getId());
        System.out.println(clone1Kopyasi.getId());
    }
}
