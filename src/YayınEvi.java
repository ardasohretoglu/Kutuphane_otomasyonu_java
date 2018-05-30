

public class YayınEvi {
    
    
    private int id;

    
    
    private  String yayın_evi_ad;
    
    private String aciklama;

    public YayınEvi(String yayın_evi_ad, String aciklama,int id) {
        this.yayın_evi_ad = yayın_evi_ad;
        this.aciklama = aciklama;
        this.id=id;
    }

    public String getYayın_evi_ad() {
        return yayın_evi_ad;
    }

    public void setYayın_evi_ad(String yayın_evi_ad) {
        this.yayın_evi_ad = yayın_evi_ad;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
