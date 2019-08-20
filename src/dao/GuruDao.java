/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entity.Guru;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import main.FormMenuUtama;
/**
 *
 * @author Daus
 */
public class GuruDao {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs= null;
    public void setConnection(Connection conn) throws Exception{
        this.conn = conn;
    }
    public String nipGuru() throws Exception{
        String nip = "";
        try{
            String query = "select nip from nilai_siswa.guru ORDER BY nip desc";
            ps = conn.prepareStatement(query);
            rs= ps.executeQuery();
            if(rs.next()){
                String temp_guru = rs.getString("nip").substring(2);
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
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
            rs.close();
        }
        return nip;
    }
    
    public boolean insertGuru(Guru data) throws Exception{
        boolean result = false;
        try{
            String query = "insert into nilai_siswa.guru(nip,nama_guru,email,password,akses) values (?,?,?,?,?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, data.getNip());
            ps.setString(2, data.getNama_guru());
            ps.setString(3, data.getEmail());
            ps.setString(4, data.getPassword());
            ps.setInt(5, data.getAkses());
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
    
    public Map<String,Object> loginGuru(Guru data) throws Exception {
       Map<String,Object> map = new HashMap<String, Object>();
        Guru entity = new Guru();
        try{
            String query = "select 1,nip,nama_guru,akses from guru where email = ? and password = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, data.getEmail());
            ps.setString(2, data.getPassword());
            rs = ps.executeQuery();
            if(rs.next()){
                if(rs.getString(1).equals("1")){
                  map.put("status", true);
                  map.put("nip", rs.getString("nip"));
                  map.put("nama_guru", rs.getString("nama_guru"));
                  map.put("akses", rs.getString("akses"));
                  map.put("flag", 1);
                }
            }else{
                    String query1 = "select 1,id_admin,nama_admin from admin where email = ? and password = ?";
                    ps = conn.prepareStatement(query1);
                    ps.setString(1, data.getEmail());
                    ps.setString(2, data.getPassword());
                    rs = ps.executeQuery();
                    if(rs.next()){
                        map.put("status", true);
                        map.put("id_admin", rs.getString("id_admin"));
                        map.put("nama_admin", rs.getString("nama_admin"));
                        map.put("akses", 3);
                        map.put("flag", 2);
                    }else{
                        map.put("status", false);
                    }
            }
        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
            rs.close();
        }
        return map;
    }
    
    public List<Map<String,Object>> getAllGuru() throws Exception{
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        try{
            ps = conn.prepareStatement("select * from guru");
            rs = ps.executeQuery();
            while(rs.next()){
                Map<String,Object> map = new HashMap<>();
                map.put("nip", rs.getString("nip"));
                map.put("nama_guru", rs.getString("nama_guru"));
                map.put("email", rs.getString("email"));
                map.put("akses", rs.getString("akses"));
//                map.put("kode_matpel", rs.getString("kode_matpel"));
//                map.put("nama_matpel", rs.getString("nama_matpel"));
                list.add(map);
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
            rs.close();
        }
        return list; 
    }
    
    public List<Map<String,Object>> getAllDetailGuru() throws Exception{
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        try{
            ps = conn.prepareStatement("select a.nip, a.nama_guru, a.email, a.email , b.kode_matpel, c.nama_matpel, a.akses\n" +
                "from guru a, matpel_guru b , matpel c\n" +
                "where a.nip = b.nip and b.kode_matpel = c.kode_matpel");
            rs = ps.executeQuery();
            while(rs.next()){
                Map<String,Object> map = new HashMap<>();
                map.put("nip", rs.getString("nip"));
                map.put("nama_guru", rs.getString("nama_guru"));
                map.put("email", rs.getString("email"));
                map.put("akses", rs.getString("akses"));
                map.put("kode_matpel", rs.getString("kode_matpel"));
                map.put("nama_matpel", rs.getString("nama_matpel"));
                list.add(map);
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
            rs.close();
        }
        return list; 
    }
    
    public List<Map<String,Object>> getGuruByParameter(String param) throws Exception{
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        String params = '%' + param + '%';
        try{
            ps = conn.prepareStatement("select * from nilai_siswa.guru where nip like ? or nama_guru like ? ");
            ps.setString(1, params);
            ps.setString(2, params);
            rs = ps.executeQuery();
            while(rs.next()){
                Map<String,Object> map = new HashMap<>();
                map.put("nip", rs.getString("nip"));
                map.put("nama_guru", rs.getString("nama_guru"));
                map.put("email", rs.getString("email"));
                map.put("akses", rs.getString("akses"));
                list.add(map);
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
            rs.close();
        }
        return list; 
    }
    
    public boolean updateGuru(Guru data) throws Exception{
        boolean result = false;
        try{
            String query = "update guru set nama_guru = ? , email = ? , akses = ? where nip = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, data.getNama_guru());
            ps.setString(2, data.getEmail());
            ps.setInt(3, data.getAkses());
            ps.setString(4, data.getNip());
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
    
     public boolean hapusGuru(String nip) throws Exception {
        boolean delete = false;
        try{
            ps = conn.prepareStatement("delete from guru  where nip = ?");
            ps.setString(1, nip);
            ps.executeUpdate();
            delete = true;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
        }
        return delete;
    }
     
      public boolean hapusMatpelGuru(String nip) throws Exception {
        boolean delete = false;
        try{
            ps = conn.prepareStatement("delete from matpel_guru  where nip = ?");
            ps.setString(1, nip);
            ps.executeUpdate();
            delete = true;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
        }
        return delete;
    }
     
    public boolean insertGuruMatpel(Guru data) throws Exception{
        boolean insert = false;
        try{
            ps = conn.prepareStatement("insert into matpel_guru(nip, kode_matpel) values (?,?)");
            ps.setString(1, data.getNip());
            ps.setString(2, data.getMatpel());
            ps.executeUpdate();
            insert = true;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            ps.close();
        }
        return insert;
    }
    
    public List<Map<String,Object>> getMatpelGuru(String nip) throws Exception{
        List<Map<String,Object>> list = new ArrayList<>();
        try{
            ps = conn.prepareStatement("select * from matpel_guru where nip = ?");
            ps.setString(1, nip);
            rs = ps.executeQuery();
            while(rs.next()){
                Map<String,Object> map = new HashMap<>();
                map.put("kode_matpel",rs.getString("kode_matpel"));
                list.add(map);
            }
        }catch(Exception e){
        
        }finally{
            ps.close();
            rs.close();
        }
        return list;
    }
}
