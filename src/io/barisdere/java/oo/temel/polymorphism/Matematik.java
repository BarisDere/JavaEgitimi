package io.barisdere.java.oo.temel.polymorphism;

public class Matematik {

    public int topla(int s1, int s2) {
        return s1 + s2;
    }

    public int topla(int s1, int s2, int s3) {
        return s1 + s2 + s3;
    }

    public double topla(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }

    public void print(String text) {
        System.out.println(text);
    }

    public void print(Integer integer) {
        System.out.println(integer);
    }

    public static void main(String[] args) {
        String text = null;
        new Matematik().print(text);
    }

}
