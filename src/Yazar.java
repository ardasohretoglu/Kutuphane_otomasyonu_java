


public class Yazar {
    
    private int id;
    
    private  String ad;
    
    private String soyad;
    
    private String aciklama;

    public Yazar(int id, String ad, String soyad, String aciklama) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.aciklama = aciklama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
    
    
}
