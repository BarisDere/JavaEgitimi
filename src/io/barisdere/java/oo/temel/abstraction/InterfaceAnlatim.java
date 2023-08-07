package io.barisdere.java.oo.temel.abstraction;

public interface InterfaceAnlatim {

    int sayi = 10; // public static final

    String getMessage(); // public abstract

    private String mesajOlustur() {
        return "Mesaj 1";
    }

    default String getItem() {
        return "1";
    }

    //void normalMetot() {  //normal metot yasak
    //}

}
interface I2 {}
interface I3 {}
interface I4 {}

class I1 implements InterfaceAnlatim, I2, I3, I4 {
    public String getMessage() {
        return "";
    }
}

class A {

    public static void main(String[] args) {
        InterfaceAnlatim intf1 = new I1();
        intf1.getMessage();
        intf1.getItem();
        System.out.println(InterfaceAnlatim.sayi);
    }
}