/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ardas
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        yazar_ekrani_ac = new javax.swing.JButton();
        yayin_evi_ekran_ac = new javax.swing.JButton();
        kitap_ekran_ac = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        jLabel1.setText("MENÜ");

        yazar_ekrani_ac.setText("Yazar İşlemleri");
        yazar_ekrani_ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yazar_ekrani_acActionPerformed(evt);
            }
        });

        yayin_evi_ekran_ac.setText("Yayın Evi İşlemleri");
        yayin_evi_ekran_ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yayin_evi_ekran_acActionPerformed(evt);
            }
        });

        kitap_ekran_ac.setText("Kitap İşlemleri");
        kitap_ekran_ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_ekran_acActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yayin_evi_ekran_ac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kitap_ekran_ac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yazar_ekrani_ac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(yazar_ekrani_ac)
                .addGap(18, 18, 18)
                .addComponent(yayin_evi_ekran_ac)
                .addGap(18, 18, 18)
                .addComponent(kitap_ekran_ac)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yazar_ekrani_acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yazar_ekrani_acActionPerformed
        // TODO add your handling code here:
        
        Yazar_ekrani yazar_ekrani = new Yazar_ekrani(this, true);
        
        setVisible(false);
            
        yazar_ekrani.setVisible(true);
        
        System.exit(0);
        
    }//GEN-LAST:event_yazar_ekrani_acActionPerformed

    private void yayin_evi_ekran_acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yayin_evi_ekran_acActionPerformed
        // TODO add your handling code here:
        
        Yayin_evi_ekrani yayin_evi_ekrani = new Yayin_evi_ekrani(this, true);
        
        setVisible(false);
        
        yayin_evi_ekrani.setVisible(true);
        
        System.exit(0);
        
    }//GEN-LAST:event_yayin_evi_ekran_acActionPerformed

    private void kitap_ekran_acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_ekran_acActionPerformed
        // TODO add your handling code here:
        
        Kitap_ekrani kitap_ekrani = new Kitap_ekrani(this, true);
        
        setVisible(false);
        
        kitap_ekrani.setVisible(true);
        
        System.exit(0);
        
    }//GEN-LAST:event_kitap_ekran_acActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kitap_ekran_ac;
    private javax.swing.JButton yayin_evi_ekran_ac;
    private javax.swing.JButton yazar_ekrani_ac;
    // End of variables declaration//GEN-END:variables
}
