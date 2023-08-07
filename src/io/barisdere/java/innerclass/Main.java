package io.barisdere.java.innerclass;

public class Main {
    public static void main(String[] args) {
        NonStaticInnerClassAnlat disSinifNonStatic = new NonStaticInnerClassAnlat();
        NonStaticInnerClassAnlat.IcSinif icSinifNonStatic = disSinifNonStatic.new IcSinif();

        StaticInnerClassAnlat.StaticIcSinif icSinifStatic = new StaticInnerClassAnlat.StaticIcSinif();

        print(new AnonymousInnerClassAnlat() {
            @Override
            public void print() {
                System.out.println("This is an anonymous inner class");
            }
        });
    }

    public static void print(AnonymousInnerClassAnlat anonymousInnerClassAnlat) {
        anonymousInnerClassAnlat.print();
    }
}
