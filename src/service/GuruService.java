/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.swing.JOptionPane;

/**
 *
 * @author Daus
 */

import dao.GuruDao;
import entity.Guru;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class GuruService extends KoneksiDb {
    GuruDao guru = new GuruDao();
    
    public String noGuru() throws Exception {
        String nip = "";
        try {
            conn = getConnection();
            conn.setAutoCommit(false);
            guru.setConnection(conn);
            nip = guru.nipGuru();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return nip;
    }
    
    public boolean insertGuru(Guru data) throws Exception{
        boolean result = false;
        try {
            conn = getConnection();
            conn.setAutoCommit(false);
            guru.setConnection(conn);
            result = guru.insertGuru(data);
            if(result) {
                conn.commit();
            }
        } catch (Exception e) {
            conn.rollback();
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return result;
    }
    
    public Map<String,Object> loginGuru(Guru data) throws Exception {
        Map<String,Object> map = new HashMap<>();
        try{
            conn = getConnection();
            guru.setConnection(conn);
            map = guru.loginGuru(data);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return map;
    }
    
     public List<Map<String,Object>> getAllGuru() throws Exception{
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        try{
           conn = getConnection();
           guru.setConnection(conn);
           list = guru.getAllGuru();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return list; 
    }
}
