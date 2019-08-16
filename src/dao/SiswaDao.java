/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.MataPelajaran;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entity.Siswa;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Daus
 */
public class SiswaDao {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs= null;
    
    public void setConnection(Connection conn) throws Exception{
        this.conn = conn;
    }
    
    public String noSiswa() throws Exception {
        String no_siswa = "";
        try {
            String query = "select nis from nilai_siswa.siswa ORDER BY nis desc";
            
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            if(rs.next()){
                String temp_siswa = rs.getString("nis").substring(2);
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
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
            rs.close();
        }
        return no_siswa;
    }
    
    public boolean insertSiswa(Siswa data) throws Exception{
        boolean result = false;
        try{
            String query = "insert into nilai_siswa.siswa(nis,jenis_kelamin,nama_siswa,alamat_siswa,kelas, tahun_ajaran) values (?,?,?,?,?,?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, data.getNis());
            ps.setString(2, data.getKelamin());
            ps.setString(3, data.getNama_siswa());
            ps.setString(4, data.getAlamat());
            ps.setString(5, data.getKelas());
            ps.setString(6, data.getTahun_ajaran());
            if(ps.executeUpdate() > 0){
                result = true;
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
        }
        return result;
    }
    
    public List<Siswa> getAllSiswa() throws Exception{
        List<Siswa> list = new ArrayList<Siswa>();
        try{
            String query = "select * from nilai_siswa.siswa";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                Siswa siswa = new Siswa();
                siswa.setNis(rs.getString("nis"));
                siswa.setNama_siswa(rs.getString("nama_siswa"));
                siswa.setKelamin(rs.getString("jenis_kelamin"));
                siswa.setKelas(rs.getString("kelas"));
                siswa.setAlamat(rs.getString("alamat_siswa"));
                siswa.setTahun_ajaran(rs.getString("tahun_ajaran"));
                list.add(siswa);
            }
        }catch(Exception e){
           throw new Exception(e.getMessage());
        }finally{
            ps.close();
            rs.close();
        }
        return list;
    }
    
    public List<Siswa> getSiswaByParameter(String param) throws Exception{
        List<Siswa> list = new ArrayList<>();
        String params = '%' + param + '%';
        try{
            String query = "select * from nilai_siswa.siswa where (nis like ?) or (nama_siswa like ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1,params);
            ps.setString(2, params);
            rs = ps.executeQuery();
            while(rs.next()){
                Siswa siswa = new Siswa();
                siswa.setNis(rs.getString("nis"));
                siswa.setNama_siswa(rs.getString("nama_siswa"));
                siswa.setKelamin(rs.getString("jenis_kelamin"));
                siswa.setKelas(rs.getString("kelas"));
                siswa.setAlamat(rs.getString("alamat_siswa"));
                siswa.setTahun_ajaran(rs.getString("tahun_ajaran"));
                list.add(siswa);
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
            rs.close();
        }
        return list;
    }
    
    public boolean updateSiswa(Siswa data) throws Exception{
        boolean update = false;
        try{
            String query = "update siswa set jenis_kelamin = ? , nama_siswa = ?, alamat_siswa = ? , kelas = ? where "
                    + "nis = ? and tahun_ajaran = ? ";
            ps = conn.prepareStatement(query);
            ps.setString(1, data.getKelamin());
            ps.setString(2, data.getNama_siswa());
            ps.setString(3, data.getAlamat());
            ps.setString(4, data.getKelas());
            ps.setString(5, data.getNis());
            ps.setString(6, data.getTahun_ajaran());
            if(ps.executeUpdate() > 0){
                update = true;
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
            rs.close();
        }
        return update;
    }
    
    public boolean insertNilaiSiswaFirst(Siswa siswa, String kode_matpel, int semester) throws Exception{
        boolean insert = false;
        try{
            ps = conn.prepareStatement("insert into nilai "
                    + "(nis, kode_matpel, uts, uas, tugas, tahun_ajaran, semester) "
                    + "values (?,?,?,?,?,?,?)");
            ps.setString(1, siswa.getNis());
            ps.setString(2, kode_matpel);
            ps.setInt(3, 0);
            ps.setInt(4, 0);
            ps.setInt(5, 0);
            ps.setString(6, siswa.getTahun_ajaran());
            ps.setInt(7, semester);
            ps.executeUpdate();
            insert = true;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
        }
        return insert;
    }
    
    public boolean hapusSiswa(String nis) throws Exception {
        boolean delete = false;
        try{
            ps = conn.prepareStatement("delete from siswa where nis = ?");
            ps.setString(1, nis);
            ps.executeUpdate();
            delete = true;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
        }
        return delete;
    }
    
}
