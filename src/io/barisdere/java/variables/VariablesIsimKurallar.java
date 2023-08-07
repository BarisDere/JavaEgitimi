package io.barisdere.java.variables;

public class VariablesIsimKurallar {
    public static void main(String[] args) {
        //region Harfler sayilar
        String keliME12;
        int UZUNLUK465abc;
        int aaaaaaaabbbbbCCC11111;
        int barisdere;
        String caydanlik = null;
        //endregion

        //region İlk karakter sayı olamaz
        String keliME13;
        //String 12keliME12;
        //String 9aaaaaa;
        String a9999999;
        //endregion

        //region Dolar ve alt cizgi
        String $kelime;
        String k_e_l_i_m_e;
        String $$$$___kl;
        String ____z$123$;
        //String kelime harf;
        //String ke**li&&;
        //String kelime-harf;
        //String !@#%^&();
        //endregion

        //region Case sensitive (büyük/küçük harfe duyarlı)
        String kelime;
        String kelimE;
        String kElime;
        String Kelime;
        String KELIME;
        //endregion

        //region Rezerve kelimeler
        //String case;
        //String interface;
        //int int;
        //String _;
        String casE;
        String interFace;
        String hello_int;
        String __;
        //endregion

        //region Variable uzunluğunda her hangi bir limit yok
        String kelime_kelime_kelime_kelime_;
        String kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime_kelime;
        //endregion

        //region İsim bulunduğu seviyede benzersiz olması gerekiyor
        String metin;
        //String metin;
        String metiN;
        char charUniCodeIle = '\u0041';
        char charKarakterIle = 'A';

        System.out.println(charUniCodeIle);
        System.out.println(charKarakterIle);
        //endregion
    }
}
