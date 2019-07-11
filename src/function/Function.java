/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import Koneksi.Koneksi;
import static Koneksi.Koneksi.conn;
import entity.Guru;
import entity.MataPelajaran;
import entity.Siswa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Daus
 */
public class Function  {
    Koneksi connection = new Koneksi();
    public List<Siswa> getAllSiswa() throws Exception{
        List<Siswa> list = new ArrayList<Siswa>();
        try{
            String query = "select nis, nama_siswa, kelas from nilai_siswa.siswa";
            connection.conn = Koneksi.koneksiDb();
            connection.ps = conn.prepareStatement(query);
            connection.rs = connection.ps.executeQuery();
            while(connection.rs.next()){
                Siswa siswa = new Siswa();
                siswa.setNis(connection.rs.getString("nis"));
                siswa.setNama_siswa(connection.rs.getString("nama_siswa"));
                list.add(siswa);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            closeConnection();
        }
        return list;
    }
    
    public List<MataPelajaran> getAllMatpel() throws Exception{
        List<MataPelajaran> list = new ArrayList<MataPelajaran>();
        try{
            String query = "select a.id_matpel, a.nama_matpel from nilai_siswa.matpel a";
            connection.conn = Koneksi.koneksiDb();
            connection.ps = conn.prepareStatement(query);
            connection.rs = connection.ps.executeQuery();
            while(connection.rs.next()){
                MataPelajaran matpel = new MataPelajaran();
                matpel.setId_matpel(connection.rs.getString("id_matpel"));
                matpel.setNama_matpel(connection.rs.getString("nama_matpel"));
                list.add(matpel);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            closeConnection();
        }
        return list;
    }
    
    public boolean insertNilai(int id_siswa, int id_matpel, int nilai) throws Exception {
        boolean result = false;
        try{
            String query = "insert into nilai_siswa.nilai (id_siswa, id_matpel, nilai) values (?,?,?)";
            connection.conn = Koneksi.koneksiDb();
            connection.conn.setAutoCommit(false);
            connection.ps = conn.prepareStatement(query);
            connection.ps.setInt(1, id_siswa);
            connection.ps.setInt(2, id_matpel);
            connection.ps.setInt(3, nilai);
            if(connection.ps.executeUpdate() == 1){
                result = true;
                connection.conn.commit();
            }
            
            if(result){
                JOptionPane.showMessageDialog(null,"Data berhasil di simpan");
            }
        }catch(Exception e){
            connection.conn.rollback();
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
             closeConnection();
        }
        return result;
    }
    
    public String noSiswa() throws Exception {
        String no_siswa = "";
        try {
            String query = "select nis from nilai_siswa.siswa ORDER BY nis desc";
            connection.conn = Koneksi.koneksiDb();
            connection.conn.setAutoCommit(false);
            
            connection.ps = connection.conn.prepareStatement(query);
            connection.rs = connection.ps.executeQuery();
            
            if(connection.rs.next()){
                String temp_siswa = connection.rs.getString("nis").substring(2);
                String an = "" + (Integer.parseInt(temp_siswa) + 1);
                String nol = "";
                if(an.length() == 1){
                    nol = "000";
                }else if (an.length() == 2){
                    nol = "00";
                }else if (an.length() == 3){
                    nol = "0";
                }else if(an.length() == 4) {
                    nol = "";
                }
                no_siswa = "15" + nol + an;
            }else{
                no_siswa = "150001";
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            closeConnection();
        }
        return no_siswa;
    }
    
    public boolean insertSiswa(Siswa data) throws Exception {
        boolean result = false;
        try{
            String query = "insert into nilai_siswa.siswa(nis,jenis_kelamin,nama_siswa,alamat_siswa,kelas) values (?,?,?,?,?)";
            connection.conn = Koneksi.koneksiDb();
            connection.conn.setAutoCommit(false);
            connection.ps = connection.conn.prepareStatement(query);
            connection.ps.setString(1, data.getNis());
            connection.ps.setString(2, data.getKelamin());
            connection.ps.setString(3, data.getNama_siswa());
            connection.ps.setString(4, data.getAlamat());
            connection.ps.setString(5, data.getKelas());
            
            if(connection.ps.executeUpdate()== 1){
                result = true;
            }
            
            if(result){
                connection.conn.commit();
            }
        }catch(Exception e){
            connection.conn.rollback();
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            closeConnection();
        }
        return result;
    }
    
    public boolean insertGuru(Guru data) throws Exception{
        boolean result = false;
        try {
            String query = "insert into nilai_siswa.guru(nip,nama_guru,email,password) values (?,?,?,?)";
            connection.conn = Koneksi.koneksiDb();
            connection.conn.setAutoCommit(false);
            connection.ps = connection.conn.prepareStatement(query);
            connection.ps.setString(1, data.getNip());
            connection.ps.setString(2, data.getNama_guru());
            connection.ps.setString(3, data.getEmail());
            connection.ps.setString(4, data.getPassword());
            if(connection.ps.executeUpdate()== 1){
                result = true;
            }
            if(result){
                connection.conn.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }finally{
            closeConnection();
        }
        return result;
    }
    
    public String noGuru() throws Exception {
        String nip = "";
        try {
            String query = "select nip from nilai_siswa.guru ORDER BY nip desc";
            connection.conn = Koneksi.koneksiDb();
            connection.conn.setAutoCommit(false);
            
            connection.ps = connection.conn.prepareStatement(query);
            connection.rs = connection.ps.executeQuery();
            
            if(connection.rs.next()){
                String temp_guru = connection.rs.getString("nip").substring(2);
                String an = "" + (Integer.parseInt(temp_guru) + 1);
                String nol = "";
                if(an.length() == 1){
                    nol = "000";
                }else if (an.length() == 2){
                    nol = "00";
                }else if (an.length() == 3){
                    nol = "0";
                }else if(an.length() == 4) {
                    nol = "";
                }
                nip = "12" + nol + an;
            }else{
                nip = "120001";
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            closeConnection();
        }
        return nip;
    }
    
    public void closeConnection() throws SQLException  {
        if(connection.ps != null){
            connection.ps.close();
        }
        if(connection.rs != null){
            connection.rs.close();
        }
        if(connection.conn != null){
             connection.conn.close();
        } 
    }
}
