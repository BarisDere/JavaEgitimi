package io.barisdere.java.errors;

public class StackTrace {

    public static void main(String[] args) throws Exception {
        try {
            m1();
        } catch (RuntimeException e) {
//            throw new Exception("Yeniden atiyorum", e);
            throw e;
        } catch (Exception e) {
            System.out.println("Exception yakaladim --> " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Bu her zaman calisir");
        }
    }

    static void m1()  {
        m2();
    }
    static void m2()  {
        m3();
    }
    static void m3()  {
        m4();
    }
    static void m4()  {
//        throw new RuntimeException("Musteri 423423 aktif degil");
        throw new MusteriAktifDegilException(423423);
    }


}
