/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
    public boolean insertNilai(int id_siswa, int id_matpel, int nilai) throws Exception {
        boolean result = false;
        try{
            String query = "insert into nilai_siswa.nilai (id_siswa, id_matpel, nilai) values (?,?,?)";
            ps = conn.prepareStatement(query);
            ps.setInt(1, id_siswa);
            ps.setInt(2, id_matpel);
            ps.setInt(3, nilai);
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
}
