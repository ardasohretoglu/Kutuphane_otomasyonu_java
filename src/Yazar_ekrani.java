
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ardas
 */
public class Yazar_ekrani extends javax.swing.JDialog {

    DefaultTableModel model;
    
    KutuphaneIslemleri islemler = new KutuphaneIslemleri();
    
    
    /**
     * Creates new form Yazar_ekrani
     */
    public Yazar_ekrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        model = (DefaultTableModel) yazar_tablosu.getModel();
        
        yazarGoruntule();
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        yazar_tablosu = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        yazar_adi_alani = new javax.swing.JTextField();
        yazar_soyadi_alani = new javax.swing.JTextField();
        aciklama_alani = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        yazar_ekle_buton = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();
        yazar_sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 200, 0, 0));

        yazar_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İd", "Ad", "Soyad", "Açıklama"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        yazar_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yazar_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(yazar_tablosu);
        if (yazar_tablosu.getColumnModel().getColumnCount() > 0) {
            yazar_tablosu.getColumnModel().getColumn(0).setResizable(false);
            yazar_tablosu.getColumnModel().getColumn(1).setResizable(false);
            yazar_tablosu.getColumnModel().getColumn(2).setResizable(false);
            yazar_tablosu.getColumnModel().getColumn(3).setResizable(false);
        }

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setText("Yazar Adı :");

        jLabel2.setText("Yazar Soyadı : ");

        jLabel3.setText("Açıklama : ");

        yazar_soyadi_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yazar_soyadi_alaniActionPerformed(evt);
            }
        });

        aciklama_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aciklama_alaniActionPerformed(evt);
            }
        });

        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 0));

        yazar_ekle_buton.setText("Yeni Yazar Ekle");
        yazar_ekle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yazar_ekle_butonActionPerformed(evt);
            }
        });

        guncelle.setText("Yazar Güncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });

        yazar_sil.setText("Yazar Sil");
        yazar_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yazar_silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                    .addComponent(arama_cubugu)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(39, 39, 39)
                                .addComponent(aciklama_alani))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(38, 38, 38)
                                .addComponent(yazar_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(yazar_soyadi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yazar_ekle_buton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yazar_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(yazar_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yazar_ekle_buton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(yazar_soyadi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncelle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(aciklama_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yazar_sil))
                .addGap(109, 109, 109)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void dinamikAra(String ara){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        yazar_tablosu.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        // TODO add your handling code here:
        
        String ara = arama_cubugu.getText();
        
        dinamikAra(ara);
        
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void yazar_soyadi_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yazar_soyadi_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yazar_soyadi_alaniActionPerformed

    private void aciklama_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aciklama_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aciklama_alaniActionPerformed

    private void yazar_ekle_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yazar_ekle_butonActionPerformed
        // TODO add your handling code here:
        
        mesaj_yazisi.setText("");
        
        String yazarAdiAlani = yazar_adi_alani.getText();
        
        String yazarSoyadiAlani = yazar_soyadi_alani.getText();
        
        String aciklamaAlani = aciklama_alani.getText();
        
        islemler.yazarEkle(yazarAdiAlani,yazarSoyadiAlani,aciklamaAlani);
        
        yazarGoruntule();
        
        mesaj_yazisi.setText("Yeni yazar eklendi");
        
    }//GEN-LAST:event_yazar_ekle_butonActionPerformed

    private void yazar_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yazar_tablosuMouseClicked
        // TODO add your handling code here:
        
        int selectedrow = yazar_tablosu.getSelectedRow();
        
        yazar_adi_alani.setText(model.getValueAt(selectedrow, 1).toString());
        yazar_soyadi_alani.setText(model.getValueAt(selectedrow, 2).toString());
        aciklama_alani.setText(model.getValueAt(selectedrow, 3).toString());
        
        
        
        
    }//GEN-LAST:event_yazar_tablosuMouseClicked

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
        // TODO add your handling code here:
        
        String yazarAdiAlani = yazar_adi_alani.getText();
        
        String yazarSoyadiAlani = yazar_soyadi_alani.getText();
        
        String aciklamaAlani = aciklama_alani.getText();
        
        
        
        int selectedrow = yazar_tablosu.getSelectedRow();
        
        if(selectedrow == -1){
            
            if(model.getRowCount()==0){
                
                mesaj_yazisi.setText("Yazar Tablosu Şuanda Boş");
                
            }else{
                
                mesaj_yazisi.setText("Lütfen güncellemek için bir yazar seçin");
                
            }
            
        }else{
            
            int id = (int) model.getValueAt(selectedrow, 0);
            
            islemler.yazarGuncelle(id,yazarAdiAlani,yazarSoyadiAlani,aciklamaAlani);
            
            yazarGoruntule();
            
            mesaj_yazisi.setText("Yazar Başarıyla Güncellendi");
        }
        
        
    }//GEN-LAST:event_guncelleActionPerformed

    private void yazar_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yazar_silActionPerformed
        // TODO add your handling code here:
        
        mesaj_yazisi.setText("");
        
        int selectedrow = yazar_tablosu.getSelectedRow();
        
        if(selectedrow == -1){
            
            if(model.getRowCount()==0){
                
                mesaj_yazisi.setText("Yazar Tablosu Şuanda Boş...");
                
            }
            
            else{
                
                mesaj_yazisi.setText("Lütfen silmek için bir yazar seçin...");
                
            }
            
        }else{
            
            int id = (int) model.getValueAt(selectedrow, 0);
            
            islemler.yazarSil(id);
            
            yazarGoruntule();
            
            mesaj_yazisi.setText("Yazar Başarıyla Silindi");
            
        }
        
    }//GEN-LAST:event_yazar_silActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void yazarGoruntule(){
        
        model.setRowCount(0);
        
        ArrayList<Yazar> yazarlar = new ArrayList<Yazar>();
        
        yazarlar = islemler.yazarlariGetir();
        
        if(yazarlar != null){
            
            for(Yazar yazar : yazarlar){
                
                Object [] eklenecek = {yazar.getId(),yazar.getAd(),yazar.getSoyad(),yazar.getAciklama()};
                
                model.addRow(eklenecek);
                
            }
            
        }
        
        
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Yazar_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Yazar_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Yazar_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Yazar_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Yazar_ekrani dialog = new Yazar_ekrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aciklama_alani;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton guncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField yazar_adi_alani;
    private javax.swing.JButton yazar_ekle_buton;
    private javax.swing.JButton yazar_sil;
    private javax.swing.JTextField yazar_soyadi_alani;
    private javax.swing.JTable yazar_tablosu;
    // End of variables declaration//GEN-END:variables
}