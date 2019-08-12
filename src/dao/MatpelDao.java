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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Daus
 */
public class MatpelDao {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs= null;
    
    public void setConnection(Connection conn) throws Exception{
        this.conn = conn;
    }
    
    public List<MataPelajaran> getAllMatpel() throws Exception{
        List<MataPelajaran> list = new ArrayList<MataPelajaran>();
        try{
            String query = "select a.kode_matpel, a.nama_matpel from nilai_siswa.matpel a";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                MataPelajaran matpel = new MataPelajaran();
                matpel.setId_matpel(rs.getString("kode_matpel"));
                matpel.setNama_matpel(rs.getString("nama_matpel"));
                list.add(matpel);
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
