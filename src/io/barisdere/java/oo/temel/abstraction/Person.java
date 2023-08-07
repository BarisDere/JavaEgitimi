package io.barisdere.java.oo.temel.abstraction;

public class Person extends MulkBilgisi implements GelirBilgisi,SaglikBilgisi {

    private int kimlikNo;
    private String isim;
    private String adres;
    private String dogumYeri;
    private String meslek;
    private String kanGrubu;
    private String hastalik;
    private double kiraGeliri;
    private double emeklilikGeliri;
    private double maasGeliri;
    private String[] hobiler;

    public int getKimlikNo() {
        return kimlikNo;
    }

    @Override
    public double aylikHarcamalar() {
        return 0;
    }

    public void setKimlikNo(int kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getDogumYeri() {
        return dogumYeri;
    }

    public void setDogumYeri(String dogumYeri) {
        this.dogumYeri = dogumYeri;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public String getKanGrubu() {
        return kanGrubu;
    }

    public void setKanGrubu(String kanGrubu) {
        this.kanGrubu = kanGrubu;
    }

    public String getHastalik() {
        return hastalik;
    }

    public void setHastalik(String hastalik) {
        this.hastalik = hastalik;
    }

    public double getKiraGeliri() {
        return kiraGeliri;
    }

    public void setKiraGeliri(double kiraGeliri) {
        this.kiraGeliri = kiraGeliri;
    }

    public double getEmeklilikGeliri() {
        return emeklilikGeliri;
    }

    public void setEmeklilikGeliri(double emeklilikGeliri) {
        this.emeklilikGeliri = emeklilikGeliri;
    }

    public double getMaasGeliri() {
        return maasGeliri;
    }

    public void setMaasGeliri(double maasGeliri) {
        this.maasGeliri = maasGeliri;
    }

    public String[] getHobiler() {
        return hobiler;
    }

    public void setHobiler(String[] hobiler) {
        this.hobiler = hobiler;
    }
}
