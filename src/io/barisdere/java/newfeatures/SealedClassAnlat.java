package io.barisdere.java.newfeatures;

public class SealedClassAnlat {

    public sealed class Sekil permits DikDortgen, Cember {}

    public final class DikDortgen extends Sekil {}
    public non-sealed class Cember extends Sekil {}

    public class Kedi extends Cember {}

}
