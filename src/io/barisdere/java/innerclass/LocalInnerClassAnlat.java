package io.barisdere.java.innerclass;

public class LocalInnerClassAnlat {

    public void print() {

        class LocalIcSinif {
            void printIcSinif() {
                System.out.println("LocalIcSinif Hello World");
            }
        }

        LocalIcSinif localIcSinif = new LocalIcSinif();
        localIcSinif.printIcSinif();
    }
}
