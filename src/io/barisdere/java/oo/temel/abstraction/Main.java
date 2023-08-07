package io.barisdere.java.oo.temel.abstraction;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        Banka banka = new Banka();
        banka.krediBasvuru(person);

        Hastane hastane = new Hastane();
        hastane.yillikCheckup(person);

        Sigorta sigorta = new Sigorta();
        sigorta.sigortaBasvuru(person);

    }
}
