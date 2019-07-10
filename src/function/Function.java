/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import Koneksi.Koneksi;
import static Koneksi.Koneksi.conn;
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
    public List<Siswa> getAllSiswa() throws SQLException{
        Koneksi connection = new Koneksi();
        List<Siswa> list = new ArrayList<Siswa>();
        try{
            String query = "select id_siswa, nama_siswa, kelas from nilai_siswa.siswa";
            connection.conn = Koneksi.koneksiDb();
            connection.ps = conn.prepareStatement(query);
            connection.rs = connection.ps.executeQuery();
            while(connection.rs.next()){
                Siswa siswa = new Siswa();
                siswa.setId_siswa(connection.rs.getString("id_siswa"));
                siswa.setNama_siswa(connection.rs.getString("nama_siswa"));
                list.add(siswa);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            connection.ps.close();
            connection.rs.close();
        }
        return list;
    }
    
    public List<MataPelajaran> getAllMatpel() throws SQLException{
        Koneksi connection = new Koneksi();
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
            connection.ps.close();
            connection.rs.close();
        }
        return list;
    }
    
    public boolean insertNilai(int id_siswa, int id_matpel, int nilai) throws Exception {
        Koneksi connection = new Koneksi();
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
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
             connection.ps.close();
        }
        return result;
    }
}
