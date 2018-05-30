
public class Kitap {
    
    private int id;
    
    private String kitap_adı;
    
    private  String kitap_alt_adı;
    
    private String kitap_seri_adı;
    
    private String yazar;
    
    private  String yayın_evi;
    
    private int Isbn_no;
    
    private String aciklama;

    public Kitap(String kitap_adı, String kitap_alt_adı, String kitap_seri_adı, String yazar, String yayın_evi, int Isbn_no, String aciklama,int id) {
        this.kitap_adı = kitap_adı;
        this.kitap_alt_adı = kitap_alt_adı;
        this.kitap_seri_adı = kitap_seri_adı;
        this.yazar = yazar;
        this.yayın_evi = yayın_evi;
        this.Isbn_no = Isbn_no;
        this.aciklama = aciklama;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKitap_adı() {
        return kitap_adı;
    }

    public void setKitap_adı(String kitap_adı) {
        this.kitap_adı = kitap_adı;
    }

    public String getKitap_alt_adı() {
        return kitap_alt_adı;
    }

    public void setKitap_alt_adı(String kitap_alt_adı) {
        this.kitap_alt_adı = kitap_alt_adı;
    }

    public String getKitap_seri_adı() {
        return kitap_seri_adı;
    }

    public void setKitap_seri_adı(String kitap_seri_adı) {
        this.kitap_seri_adı = kitap_seri_adı;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYayın_evi() {
        return yayın_evi;
    }

    public void setYayın_evi(String yayın_evi) {
        this.yayın_evi = yayın_evi;
    }

    public int getIsbn_no() {
        return Isbn_no;
    }

    public void setIsbn_no(int Isbn_no) {
        this.Isbn_no = Isbn_no;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
    
}
