package io.barisdere.java.oo.temel;

public class FieldsExplanation {

    //constant
    public static final int GENISLIK = 100;
    //property
    private String renk;
    //field
    private int[] sayilar;

    public FieldsExplanation(String renk) {
        this.renk = renk;
        String text = "BarisDere";
        this.sayilar = new int[]{1,2,3};
        for (int sayi : sayilar) {
            String site = "www.barisdere.io/" + sayi;
        }
        //System.out.println(site);
    }

    public String getRenk() {
        //System.out.println(text);
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

}
