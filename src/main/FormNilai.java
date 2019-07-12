/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.MataPelajaran;
import entity.Siswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import service.SiswaService;
import service.GuruService;
import service.MatpelService;
import service.NilaiService;
/**
 *
 * @author Daus
 */
public class FormNilai extends javax.swing.JFrame {
    SiswaService siswaService ;
    GuruService guruService;
    MatpelService matpelService;
    NilaiService nilaiService;
    /**
     * Creates new form FormNilai
     */
    public FormNilai() throws Exception {
        initComponents();
        siswaService = new SiswaService();
        guruService = new GuruService();
        matpelService = new MatpelService();
        loadSiswa();
        loadMatpel();
        cmbMatpel.addActionListener(new ComboBoxListener());
        cmbNamaSiswa.addActionListener(new ComboBoxListener());
        actionButton(true, false, false, true);
        actionField(false, false, false, false, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbNamaSiswa = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbMatpel = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        inpNilai = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        inpNamaSiswa = new javax.swing.JTextField();
        inpMatpel = new javax.swing.JTextField();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Input Data Nilai Siswa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama Siswa");

        cmbNamaSiswa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNamaSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNamaSiswaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mata Pelajaran");

        cmbMatpel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMatpel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMatpelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nilai");

        inpNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpNilaiActionPerformed(evt);
            }
        });
        inpNilai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inpNilaiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inpNilaiKeyTyped(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");

        inpNamaSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpNamaSiswaActionPerformed(evt);
            }
        });

        inpMatpel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpMatpelActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addComponent(btnTambah))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbMatpel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbNamaSiswa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inpMatpel)
                                    .addComponent(inpNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inpNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal)
                        .addGap(18, 18, 18)
                        .addComponent(btnSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btnKeluar)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbMatpel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpMatpel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inpNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnTambah)
                    .addComponent(btnKeluar)
                    .addComponent(btnBatal))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNamaSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNamaSiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNamaSiswaActionPerformed

    private void cmbMatpelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMatpelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMatpelActionPerformed

    private void inpNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpNilaiActionPerformed

    private void inpNilaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inpNilaiKeyPressed

    }//GEN-LAST:event_inpNilaiKeyPressed

    private void inpNilaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inpNilaiKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_inpNilaiKeyTyped

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed

        int flag;
        flag = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menyimpan ?","Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(flag == 0){
            int id_siswa = Integer.parseInt(cmbNamaSiswa.getSelectedItem().toString());
            int id_matpel = Integer.parseInt(cmbMatpel.getSelectedItem().toString());
            int nilai = Integer.parseInt(inpNilai.getText().toString());
            try {
                loadInsertNilai(id_siswa, id_matpel, nilai);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed
    
    private void loadSiswa() throws Exception{
        cmbNamaSiswa.removeAllItems();
        List<Siswa> siswa = siswaService.getAllSiswa();
        cmbNamaSiswa.addItem("--Pilih--");
        
        for(Siswa result : siswa){
            cmbNamaSiswa.addItem(result);
        } 
    }
    
    private void loadMatpel() throws Exception{
        cmbMatpel.removeAllItems();
        List<MataPelajaran> matpel = matpelService.getAllMatpel();
        cmbMatpel.addItem("--Pilih--");
        
        for(MataPelajaran result : matpel){
            cmbMatpel.addItem(result);
        } 
    }
    
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        actionButton(false,true , true, false);
        actionField(true, true, true, true, true);
        inpNamaSiswa.setEditable(false);
        inpMatpel.setEditable(false);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void inpNamaSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpNamaSiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpNamaSiswaActionPerformed

    private void inpMatpelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpMatpelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpMatpelActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        actionField(false, false, false, false, false);
        actionButton(true, false, false, true);
    }//GEN-LAST:event_btnBatalActionPerformed

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
            java.util.logging.Logger.getLogger(FormNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormNilai formNilai;
                try {
                    formNilai = new FormNilai();
                    formNilai.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    formNilai.setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(FormNilai.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
    
    private void loadInsertNilai(int id_siswa, int id_matpel, int nilai) throws Exception {
        nilaiService.insertNilai(id_siswa, id_matpel, nilai);
        clearField();
    }
    
    private class ComboBoxListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(cmbNamaSiswa.getSelectedItem().equals("--Pilih--")){
                inpNamaSiswa.setText("");
            }else{
                Siswa siswa=(Siswa) cmbNamaSiswa.getSelectedItem();
                inpNamaSiswa.setText(siswa.getNama_siswa());
            }
            
            if(cmbMatpel.getSelectedItem().equals("--Pilih--")){
                inpMatpel.setText("");
            }else{
                MataPelajaran matpel=(MataPelajaran) cmbMatpel.getSelectedItem();
                inpMatpel.setText(matpel.getNama_matpel());
            }
        }
        
    }
    
    private void clearField() {
        cmbNamaSiswa.setSelectedItem("--Pilih--");
        inpNamaSiswa.setText("");
        cmbMatpel.setSelectedItem("--Pilih--");
        inpMatpel.setText("");
        inpNilai.setText("");
    }
    
    private void actionButton(boolean tambah, boolean batal, boolean simpan, boolean keluar) {
        btnTambah.setEnabled(tambah);
        btnBatal.setEnabled(batal);
        btnSimpan.setEnabled(simpan);
        btnKeluar.setEnabled(keluar);
    }
    
    private void actionField(boolean nis, boolean nama_siswa, boolean kode_matpel, boolean matpel, boolean nilai) {
        cmbNamaSiswa.setEnabled(nis);
        inpNamaSiswa.setEnabled(nama_siswa);
        cmbMatpel.setEnabled(kode_matpel);
        inpMatpel.setEnabled(matpel);
        inpNilai.setEnabled(nilai);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox cmbMatpel;
    private javax.swing.JComboBox cmbNamaSiswa;
    private javax.swing.JTextField inpMatpel;
    private javax.swing.JTextField inpNamaSiswa;
    private javax.swing.JTextField inpNilai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}