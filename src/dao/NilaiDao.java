/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Guru;
import entity.MataPelajaran;
import entity.NilaiEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Daus
 */
public class NilaiDao {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs= null;
    
    public void setConnection(Connection conn) throws Exception{
        this.conn = conn;
    }
    
    public boolean insertNilai(NilaiEntity data) throws Exception {
        boolean result = false;
        try{
            String query = "insert into nilai_siswa.nilai (nis, kode_matpel, uts, uas, tugas, tahun_ajaran) values (?,?,?,?,?,?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, data.getNis());
            ps.setString(2, data.getId_matpel());   
            ps.setInt(3,data.getNilai_uts());
            ps.setInt(4, data.getNilai_uas());
            ps.setInt(5, data.getNilai_tugas());
            ps.setString(6, data.getTahun_ajaran());
            if(ps.executeUpdate() == 1){
                result = true;
            }
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
        }
        return result;
    }
    
    public List<Map<String,Object>> getAllNilai() throws Exception{
        List<Map<String,Object>> list = new ArrayList<>();
        try{
            ps = conn.prepareStatement("select a.nis, a.nama_siswa, "
                    + "a.kelas, c.nama_matpel, b.uts, b.uas, b.tugas, "
                    + "b.tahun_ajaran from nilai_siswa.siswa a, "
                    + "nilai_siswa.nilai b, nilai_siswa.matpel c "
                    + "where a.nis = b.nis and b.kode_matpel = c.kode_matpel");
            rs = ps.executeQuery();
            while(rs.next()){
                Map<String,Object> map = new HashMap<>();
                map.put("nis", rs.getString(1));
                map.put("nama_siswa", rs.getString(2));
                map.put("kelas", rs.getString(3));
                map.put("nama_matpel", rs.getString(4));
                map.put("uts", rs.getString(5));
                map.put("uas", rs.getString(6));
                map.put("tugas", rs.getString(7));
                map.put("tahun_ajaran", rs.getString(8));
                list.add(map);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps.close();
            rs.close();
        }
        return list;
    }
    
    public String kelasSiswa(String nis) throws Exception{
        String kelas = "";
        try{
            String query = "select * from nilai_siswa.siswa aa where aa.nis = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, nis);
            rs = ps.executeQuery();
            while(rs.next()){
                kelas = rs.getString("kelas");
            }
        }catch(Exception e){
           throw new Exception(e.getMessage());
        }finally{
            ps.close();
            rs.close();
        }
        return kelas;
    }
}
