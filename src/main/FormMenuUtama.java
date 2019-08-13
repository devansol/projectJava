/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.Guru;
import entity.Session;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Daus
 */
public class FormMenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form FormMenuUtama
     */
    String sessionName = Session.getSessionName();
    String sessionNip = Session.getSessionNip();
    String sessionAkses = Session.getSessionAkses();
    public FormMenuUtama() {
        initComponents();
        if(sessionAkses.equals("2")){
            btnCetak.setVisible(false);
            btnGuru.setVisible(false);
            btnSiswa.setVisible(false);
            btnInputNilai.setVisible(true);
            btnLogout.setVisible(true);
        }else if(sessionAkses.equals("1")){
            btnCetak.setVisible(true);
            btnGuru.setVisible(false);
            btnSiswa.setVisible(false);
            btnInputNilai.setVisible(true);
            btnLogout.setVisible(true);
        }else{
            btnCetak.setVisible(false);
            btnGuru.setVisible(true);
            btnSiswa.setVisible(true);
            btnInputNilai.setVisible(false);
            btnLogout.setVisible(true);
        }
        labelNamaGuru.setText(sessionName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNamaGuru = new javax.swing.JLabel();
        btnInputNilai = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnSiswa = new javax.swing.JButton();
        btnGuru = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Selamat Datang");

        labelNamaGuru.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelNamaGuru.setText("Nama Guru");

        btnInputNilai.setText("Input Nilai");
        btnInputNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputNilaiActionPerformed(evt);
            }
        });

        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnSiswa.setText("Data Siswa");
        btnSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiswaActionPerformed(evt);
            }
        });

        btnGuru.setText("Data Guru");
        btnGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuruActionPerformed(evt);
            }
        });

        btnCetak.setText("Cetak Rapot");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNamaGuru))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(btnInputNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuru, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(btnCetak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelNamaGuru))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputNilai)
                    .addComponent(btnCetak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuru)
                    .addComponent(btnSiswa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputNilaiActionPerformed
        // TODO add your handling code here:
        FormNilai formNilai;
        try {
            formNilai = new FormNilai();
            formNilai.setVisible(true);
            formNilai.setTitle("Form Input Nilai");
            formNilai.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(FormMenuUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnInputNilaiActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        try {
            FormLogin loginForm = new FormLogin();
            loginForm.setVisible(true);
            loginForm.setTitle("Form Login");
            loginForm.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(FormMenuUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuruActionPerformed
        // TODO add your handling code here:
        FormGuru formGuru;
        try {
            formGuru = new FormGuru();
            formGuru.setVisible(true);
            formGuru.setExtendedState(JFrame.MAXIMIZED_BOTH);
            formGuru.setTitle("Form Input Guru");
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(FormMenuUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnGuruActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        FormCetakRapot formRapot;
        try {
            formRapot = new FormCetakRapot();
            formRapot.setVisible(true);
            formRapot.setExtendedState(JFrame.MAXIMIZED_BOTH);
            formRapot.setTitle("Form Cetak Laporan");
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(FormMenuUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiswaActionPerformed
        // TODO add your handling code here:
        FormSiswa formSiswa;
        try {
            formSiswa = new FormSiswa();
            formSiswa.setVisible(true);
            formSiswa.setExtendedState(JFrame.MAXIMIZED_BOTH);
            formSiswa.setTitle("Form Input Siswa");
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(FormMenuUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSiswaActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormMenuUtama menuUtama = new FormMenuUtama();
                menuUtama.setExtendedState(JFrame.MAXIMIZED_BOTH);
                menuUtama.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnGuru;
    private javax.swing.JButton btnInputNilai;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNamaGuru;
    // End of variables declaration//GEN-END:variables
}
