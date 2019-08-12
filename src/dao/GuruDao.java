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
            ps = conn.prepareStatement("select * from nilai_siswa.guru");
            rs = ps.executeQuery();
            while(rs.next()){
                Map<String,Object> map = new HashMap<>();
                map.put("nip", rs.getString("nip"));
                map.put("nama_guru", rs.getString("nama_guru"));
                map.put("email", rs.getString("email"));
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
}
