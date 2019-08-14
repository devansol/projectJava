/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.MataPelajaran;
import entity.NilaiEntity;
import entity.Session;
import entity.Siswa;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.SiswaService;
import service.GuruService;
import service.MatpelService;
import service.NilaiService;
/**
 *
 * @autloadhor Daus
 */
public class FormNilai extends javax.swing.JFrame {
    SiswaService siswaService ;
    GuruService guruService;
    MatpelService matpelService;
    NilaiService nilaiService;
    /**
     * Creates new form FormNilai
     * @throws java.lang.Exception
     */
    public FormNilai() throws Exception {
        initComponents();
        siswaService = new SiswaService();
        guruService = new GuruService();
        matpelService = new MatpelService();
        nilaiService = new NilaiService();
        loadSiswa();
//        loadMatpel();
        setMataPelajaran();
        tahunAjaran();
        loadTable();
//        cmbMatpel.addActionListener(new ComboBoxListener());
//        cmbNamaSiswa.addActionListener(new ComboBoxListener());
        actionButton(true, false, false, true);
        actionField(false, false, false, false, false, false,false,false,false);
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
        inpNilaiUts = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbTahunAjaran = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inpNilaiUas = new javax.swing.JTextField();
        inpNilaiTugas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNilaiSiswa = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false; //Disallow the editing of any cell
            }
        };
        jLabel8 = new javax.swing.JLabel();
        inpKelas = new javax.swing.JTextField();

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
        jLabel4.setText("Nilai UTS");

        inpNilaiUts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpNilaiUtsActionPerformed(evt);
            }
        });
        inpNilaiUts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inpNilaiUtsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inpNilaiUtsKeyTyped(evt);
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
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tahun Ajaran");

        cmbTahunAjaran.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTahunAjaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTahunAjaranActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nilai Tugas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Nilai UAS");

        inpNilaiUas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpNilaiUasActionPerformed(evt);
            }
        });
        inpNilaiUas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inpNilaiUasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inpNilaiUasKeyTyped(evt);
            }
        });

        inpNilaiTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpNilaiTugasActionPerformed(evt);
            }
        });
        inpNilaiTugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inpNilaiTugasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inpNilaiTugasKeyTyped(evt);
            }
        });

        tableNilaiSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "Nama Siswa", "Kelas", "Mata Pelajaran", "Nilai UTS", "Nilai Uas", "Nilai Tugas", "Tahun Ajaran"
            }
        ));
        jScrollPane1.setViewportView(tableNilaiSiswa);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Kelas");

        inpKelas.setEditable(false);
        inpKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpKelasActionPerformed(evt);
            }
        });
        inpKelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inpKelasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inpKelasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inpKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbMatpel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(126, 126, 126)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inpNilaiUts, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inpNilaiUas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inpNilaiTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(cmbTahunAjaran, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addGap(18, 18, 18)
                                .addComponent(btnKeluar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(btnBatal)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(inpNilaiUts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(inpNilaiUas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inpNilaiTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbMatpel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmbTahunAjaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnKeluar)
                    .addComponent(btnSimpan)
                    .addComponent(btnBatal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inpNilaiTugasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inpNilaiTugasKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE  || c == KeyEvent.VK_DELETE){
            evt.consume();
        }
    }//GEN-LAST:event_inpNilaiTugasKeyTyped

    private void inpNilaiTugasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inpNilaiTugasKeyPressed
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_inpNilaiTugasKeyPressed

    private void inpNilaiTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpNilaiTugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpNilaiTugasActionPerformed

    private void inpNilaiUasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inpNilaiUasKeyTyped
        // TODO add your handling code here:
       char c = evt.getKeyChar();
        if(!Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE  || c == KeyEvent.VK_DELETE){
            evt.consume();
        }
    }//GEN-LAST:event_inpNilaiUasKeyTyped

    private void inpNilaiUasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inpNilaiUasKeyPressed
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_inpNilaiUasKeyPressed

    private void inpNilaiUasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpNilaiUasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpNilaiUasActionPerformed

    private void cmbTahunAjaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTahunAjaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTahunAjaranActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        actionField(false, false, false, false, false, false,false,false,false);
        actionButton(true, false, false, true);
        clearField();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        FormMenuUtama formMenuUtama = new FormMenuUtama();
        formMenuUtama.setVisible(true);
        formMenuUtama.setTitle("Menu Utama");
        formMenuUtama.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(false);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        actionButton(false,true , true, false);
        actionField(true, true, true, true, true, true,true,true,true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed

        int flag;
        NilaiEntity entity = new NilaiEntity();
        flag = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menyimpan ?","Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(flag == 0){
            String nis = getCodeComboBox(cmbNamaSiswa.getSelectedItem().toString());
            String kode_matpel = getCodeComboBox(cmbMatpel.getSelectedItem().toString());
            
            entity.setId_matpel(kode_matpel);
            entity.setNis(nis);
            entity.setNilai_uts(Integer.parseInt(inpNilaiUts.getText()));
            entity.setNilai_uas(Integer.parseInt(inpNilaiUas.getText()));
            entity.setNilai_tugas(Integer.parseInt(inpNilaiTugas.getText()));
            entity.setTahun_ajaran(cmbTahunAjaran.getSelectedItem().toString());
            try {
                loadInsertNilai(entity);
                loadTable();
                actionField(false, false, false, false, false, false,false,false,false);
                actionButton(true, false, false, true);
                clearField();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void inpNilaiUtsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inpNilaiUtsKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE  || c == KeyEvent.VK_DELETE){
            evt.consume();
        }
    }//GEN-LAST:event_inpNilaiUtsKeyTyped

    private void inpNilaiUtsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inpNilaiUtsKeyPressed
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_inpNilaiUtsKeyPressed

    private void inpNilaiUtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpNilaiUtsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpNilaiUtsActionPerformed

    private void cmbMatpelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMatpelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMatpelActionPerformed

    private void cmbNamaSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNamaSiswaActionPerformed
        // TODO add your handling code here:
        try {
            String nis = getCodeComboBox(cmbNamaSiswa.getSelectedItem().toString());
            String kelas = nilaiService.kelasSiswa(nis);
            inpKelas.setText(kelas);
        } catch (Exception ex) {
            Logger.getLogger(FormNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cmbNamaSiswaActionPerformed

    private void inpKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpKelasActionPerformed

    private void inpKelasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inpKelasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpKelasKeyPressed

    private void inpKelasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inpKelasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inpKelasKeyTyped
    
    private void loadSiswa() throws Exception{
        cmbNamaSiswa.removeAllItems();
        List<Siswa> siswa = siswaService.getAllSiswa();
        cmbNamaSiswa.addItem("--Pilih--");
        for(Siswa result : siswa){
            cmbNamaSiswa.addItem(result.getNis() + " - "+ result.getNama_siswa());
        } 
    }
    
    private void loadMatpel() throws Exception{
        cmbMatpel.removeAllItems();
        List<MataPelajaran> matpel = matpelService.getAllMatpel();
        cmbMatpel.addItem("--Pilih--");
        
        for(MataPelajaran result : matpel){
            cmbMatpel.addItem(result.getId_matpel() +" - "+result.getNama_matpel());
        } 
    }
    
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
    
    private void loadInsertNilai(NilaiEntity data) throws Exception {
        boolean result = false;
        result = nilaiService.insertNilai(data);
        if(result){
            JOptionPane.showMessageDialog(null, "Data berhasil di simpan");
        }else{
            JOptionPane.showMessageDialog(null, "Data gagal di simpan");
        }
        
        clearField();
    }
    
    private void loadTable() throws Exception{
        List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
        DefaultTableModel model = new DefaultTableModel();
        tableNilaiSiswa.setModel(model);
        model.getDataVector().removeAllElements();
        model.addColumn("NIS");
        model.addColumn("Nama Siswa");
        model.addColumn("Kelas");
        model.addColumn("Mata Pelajaran");
        model.addColumn("Nilai UTS");
        model.addColumn("Nilai UAS");
        model.addColumn("Nilai Tugas");
        model.addColumn("Tahun Ajaran");
        try{
            list = nilaiService.getAllNilai();
            System.out.println(list);
            Object[] obj = new Object[8];
            for(int i = 0 ; i < list.size() ; i++){
                obj[0] = list.get(i).get("nis").toString();
                obj[1] = list.get(i).get("nama_siswa").toString();
                obj[2] = list.get(i).get("kelas").toString();
                obj[3] = list.get(i).get("nama_matpel").toString();
                obj[4] = list.get(i).get("uts").toString();
                obj[5] = list.get(i).get("uas").toString();
                obj[6] = list.get(i).get("tugas").toString();
                obj[7] = list.get(i).get("tahun_ajaran").toString();
                model.addRow(obj);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
//    private class ComboBoxListener implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if(cmbNamaSiswa.getSelectedItem().equals("--Pilih--")){
//                inpNamaSiswa.setText("");
//            }else{
//                Siswa siswa=(Siswa) cmbNamaSiswa.getSelectedItem();
//                inpNamaSiswa.setText(siswa.getNama_siswa());
//            }
//            
//            if(cmbMatpel.getSelectedItem().equals("--Pilih--")){
//                inpMatpel.setText("");
//            }else{
//                MataPelajaran matpel=(MataPelajaran) cmbMatpel.getSelectedItem();
//                inpMatpel.setText(matpel.getNama_matpel());
//            }
//        }
//        
//    }
    
    private void clearField() {
        cmbNamaSiswa.setSelectedItem("--Pilih--");
        cmbMatpel.setSelectedItem("--Pilih--");
        inpNilaiUts.setText("");
        cmbTahunAjaran.setSelectedItem("--Pilih--");
        inpNilaiUas.setText("");
        inpNilaiTugas.setText("");
    }
    
    private void actionButton(boolean tambah, boolean batal, boolean simpan, boolean keluar) {
        btnTambah.setEnabled(tambah);
        btnBatal.setEnabled(batal);
        btnSimpan.setEnabled(simpan);
        btnKeluar.setEnabled(keluar);
    }
    
    private void actionField(boolean nis, boolean nama_siswa, boolean kode_matpel, boolean matpel, boolean nilai_uts, boolean tahun_ajaran, boolean nilai_uas,
            boolean nilai_tugas, boolean kelas) {
        cmbNamaSiswa.setEnabled(nis);
        cmbMatpel.setEnabled(kode_matpel);
        inpNilaiUts.setEnabled(nilai_uts);
        inpNilaiUas.setEnabled(nilai_uas);
        inpNilaiTugas.setEnabled(nilai_tugas);
        cmbTahunAjaran.setEnabled(tahun_ajaran);
        inpKelas.setEnabled(kelas);
    }
    
    private void tahunAjaran() throws Exception{
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int years = year + 1;
        cmbTahunAjaran.removeAllItems();
        cmbTahunAjaran.addItem("--Pilih--");
        for(int i = 2010 ; i <= year; i++){
            for(int j = i ; j <= i; j++){
                int newYear = j+1;
                cmbTahunAjaran.addItem(i + "/" + newYear);
            }
        }
    }
    
    private String getCodeComboBox(String param) {
        String code = "";
        String[] arr = param.split(" ");
	code = arr[0];	
	return code;
    }
    
    void setMataPelajaran() throws Exception {
        List<MataPelajaran> matpel = new ArrayList<>();
        try{
            if(Session.getSessionAkses().equals("2")){
                matpel = matpelService.getMatpelByNipGuru(Session.getSessionNip());
            }else{
                matpel = matpelService.getAllMatpel();
            }
            
            cmbMatpel.removeAllItems();
            cmbMatpel.addItem("--Pilih--");
            for(MataPelajaran result : matpel){
                cmbMatpel.addItem(result.getId_matpel() +" - "+result.getNama_matpel());
            } 
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
                
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox cmbMatpel;
    private javax.swing.JComboBox cmbNamaSiswa;
    private javax.swing.JComboBox cmbTahunAjaran;
    private javax.swing.JTextField inpKelas;
    private javax.swing.JTextField inpNilaiTugas;
    private javax.swing.JTextField inpNilaiUas;
    private javax.swing.JTextField inpNilaiUts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableNilaiSiswa;
    // End of variables declaration//GEN-END:variables
}
