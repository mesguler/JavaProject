/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBS;

/**
 *
 * @author MG
 */


public class Personel {
    
    private int sicilNo;
    private String ad;
    private String soyad;
    private String birim;
    private String durum;
    private String baslama;
    private String dob;

    public Personel(int sicilNo, String ad, String soyad, String birim, String durum, String baslama, String dob) {
        this.sicilNo = sicilNo;
        this.ad = ad;
        this.soyad = soyad;
        this.birim = birim;
        this.durum = durum;
        this.baslama = baslama;
        this.dob = dob;
        
        
    }
    
   public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String departman) {
        this.birim = birim;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
    
    public String getBaslama() {
        return baslama;
    }
     public void setBaslama(String baslama) {
        this.baslama = baslama;
    }
    public String getDob() {
        return dob;
    }
     public void setDob(String dob) {
        this.dob = dob;
    }
}


