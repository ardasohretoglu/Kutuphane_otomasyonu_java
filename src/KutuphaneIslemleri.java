
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;






public class KutuphaneIslemleri {
    
    private Connection con = null;
    
    private Statement statement = null;
    
    private PreparedStatement preparedStatement = null;
    
    
    public ArrayList<Kitap> kitapGetir(){
        
        ArrayList<Kitap> cikti = new ArrayList<Kitap>();
        
        try {
            statement = con.createStatement();
            
            String sorgu = "SELECT * FROM `kitap`";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                String kitap_adi = rs.getString("Kitap Adı");
                String kitap_alt_adi = rs.getString("Kitap Alt Adı");
                String kitap_seri_adi = rs.getString("Kitap Seri Adı");
                String yazar = rs.getString("Yazar");
                String yayin_evi_adi = rs.getString("Yayın Evi");
                int isbn_no = rs.getInt("Isbn No");
                String aciklama = rs.getString("Açıklama");
                int id = rs.getInt("id");
                
                cikti.add(new Kitap(kitap_adi, kitap_alt_adi, kitap_seri_adi, yazar, yayin_evi_adi, isbn_no, aciklama,id));
                
            }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(KutuphaneIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
        
    }
    
    public ArrayList<YayınEvi> yayinEviGetir(){
        
        ArrayList<YayınEvi> cikti = new ArrayList<YayınEvi>();
        
        try {
            statement = con.createStatement();
            
            String sorgu ="SELECT * FROM `yayın evi";
            
            ResultSet rs= statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                String yayin_evi_ad = rs.getString("Yayın Evi Ad");
                String aciklama = rs.getString("Açıklama");
                
                int id = rs.getInt("id");
                
                cikti.add(new YayınEvi(yayin_evi_ad, aciklama,id));
                
            }
            
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(KutuphaneIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    public ArrayList<Yazar> yazarlariGetir(){
        
        ArrayList<Yazar> cikti = new ArrayList<Yazar>();
        
        try {
            statement = con.createStatement();
            
            String sorgu = "Select * From yazarlar";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                int id = rs.getInt("id");
                String ad = rs.getString("Ad");
                String soyad = rs.getString("Soyad");
                String aciklama = rs.getString("Açıklama");
                
                cikti.add(new Yazar(id, ad, soyad, aciklama));
                
                
            }
            
            return cikti;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KutuphaneIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    public void yazarEkle(String yazarAdi, String yazarSoyadi, String aciklama){
        
        
        String sorgu = "Insert Into yazarlar (`Ad`,`Soyad`,`Açıklama`) VALUES (?,?,?) ";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yazarAdi);
            preparedStatement.setString(2, yazarSoyadi);
            preparedStatement.setString(3, aciklama);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KutuphaneIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    public void yayinEviEkle(String yayinEvi, String aciklama){
        
        String sorgu = "Insert Into `yayın evi` (`Yayın Evi Ad`,`Açıklama`) VALUES (?,?) ";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yayinEvi);
            preparedStatement.setString(2, aciklama);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KutuphaneIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void kitapEkle(String kitapAd, String kitapAltAd, String kitapSeriAd, String yazar, String yayinEvi,int isbnNo,String aciklama){
        
        String sorgu = "Insert Into kitap (`Kitap Adı`,`Kitap Alt Adı`,`Kitap Seri Adı`,`Yazar`,`Yayın Evi`,`Isbn No`,`Açıklama` ) VALUES (?,?,?,?,?,?,?) ";
        
        try {
            
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kitapAd);
            preparedStatement.setString(2, kitapAltAd);
            preparedStatement.setString(3, kitapSeriAd);
            preparedStatement.setString(4, yazar);
            preparedStatement.setString(5, yayinEvi);
            preparedStatement.setInt(6, isbnNo);
            preparedStatement.setString(7, aciklama);
            
            
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KutuphaneIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void kitapGuncelle(int id,String kitap_adi,String kitap_alt_adi,String kitap_seri_adi,String yazar,String yayin_evi,int Isbn_no,String aciklama){
        
        String sorgu = "UPDATE `kitap` SET `Kitap Adı`=?,`Kitap Alt Adı`=?,`Kitap Seri Adı`=?,`Yazar`=?,`Yayın Evi`=?,`Isbn No`=?,`Açıklama`=? WHERE id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kitap_adi);
            preparedStatement.setString(2, kitap_alt_adi);
            preparedStatement.setString(3, kitap_seri_adi);
            preparedStatement.setString(4, yazar);
            preparedStatement.setString(5, yayin_evi);
            preparedStatement.setInt(6, Isbn_no);
            preparedStatement.setString(7, aciklama);
            
            preparedStatement.setInt(8, id);
            
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KutuphaneIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void yayinEviGuncelle(int id,String yeni_yayin_evi_ad,String yeni_aciklama ){
        
        String sorgu = "UPDATE `yayın evi` SET `Yayın Evi Ad`=?,`Açıklama`=? WHERE id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yeni_yayin_evi_ad);
            preparedStatement.setString(2, yeni_aciklama);
            
            preparedStatement.setInt(3, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KutuphaneIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void yazarGuncelle(int id,String yeni_yazar_ad,String yeni_yazar_soyad,String yeni_aciklama){
        
        String sorgu = "UPDATE `yazarlar` SET `Ad`=?,`Soyad`=?,`Açıklama`=? WHERE id = ? ";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yeni_yazar_ad);
            preparedStatement.setString(2, yeni_yazar_soyad);
            preparedStatement.setString(3, yeni_aciklama);
            
            preparedStatement.setInt(4, id);
            
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KutuphaneIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void yazarSil(int id){
        
        String sorgu ="Delete From `yazarlar` where id = ? ";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KutuphaneIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void yayinEviSil(int id){
        
        String sorgu = " Delete From `yayın evi` where id = ?  ";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KutuphaneIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void kitapSil(int id){
        
        String sorgu = " Delete From `kitap` where id = ? ";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KutuphaneIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    public boolean girisYap(String kullanici_adi, String parola){
        
        String sorgu = "Select * From adminler where username = ? and password = ? ";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanici_adi);
            
            preparedStatement.setString(2, parola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KutuphaneIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
        
        
    }
    
    
    public KutuphaneIslemleri(){
        
        String url = "jdbc:mysql://"+DataBase.host+":"+DataBase.port+"/"+DataBase.db_ismi+ "?useUnicode=true&characterEncoding=utf8" ;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            
        } catch (ClassNotFoundException ex) {
            
            System.out.println("Driver Bulunamadı");
            
        }
        
        try {
            con = DriverManager.getConnection(url, DataBase.kullanici_adi, DataBase.parola);
            
            System.out.println("Bağlantı Başarılı");
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız");   
        }
    }
    
    
    public static void main(String[] args) {
        
        KutuphaneIslemleri kutuphaneIslemleri = new KutuphaneIslemleri();
        
    }
    
}
