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
        boolean insertGuruMatpel = false;
        try {
            conn = getConnection();
            conn.setAutoCommit(false);
            guru.setConnection(conn);
            result = guru.insertGuru(data);
            insertGuruMatpel = guru.insertGuruMatpel(data);
            if(result && insertGuruMatpel){
                conn.commit();
            }else{
                conn.rollback();
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
    
    public List<Map<String,Object>> getAllDetailGuru() throws Exception{
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        try{
           conn = getConnection();
           guru.setConnection(conn);
           list = guru.getAllDetailGuru();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return list; 
    }
    
    public List<Map<String,Object>> getGuruByParameter(String param) throws Exception{
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        try{
           conn = getConnection();
           guru.setConnection(conn);
           list = guru.getGuruByParameter(param);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return list; 
    }
    
    public int validasiGuru(String nip) throws Exception {
        int count = 0;
        try{
            List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
            conn = getConnection();
            guru.setConnection(conn);
            list = guru.getGuruByParameter(nip);
            if(list.size() > 0){
                count = 1;
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return count;
    }
    
    public boolean updateGuru(Guru data) throws Exception{
        boolean result = false;
        List<Map<String,Object>> dataMatpel = new ArrayList<>();
        boolean insert = false;
        
        try{
            conn = getConnection();
            conn.setAutoCommit(false);
            guru.setConnection(conn);
            result = guru.updateGuru(data);
            dataMatpel = guru.getMatpelGuru(data.getNip());
            
            for(int i = 0 ; i < dataMatpel.size() ; i++){
                if(!dataMatpel.get(i).get("kode_matpel").equals(data.getMatpel())){
                    insert = guru.insertGuruMatpel(data);
                }
            }
            
            if(result) {
                conn.commit();
            }else{
                conn.rollback();
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
           conn.close();
        }
        return result;
    }
    
    
    public boolean hapusGuru(String nip) throws Exception {
        boolean delete = false;
        boolean deleteMatpelGuru = false;
        try{
            conn = getConnection();
            conn.setAutoCommit(false);
            guru.setConnection(conn);
            delete = guru.hapusGuru(nip);
            deleteMatpelGuru = guru.hapusMatpelGuru(nip);
            if(delete && deleteMatpelGuru) {
                conn.commit();
            }else{
                conn.rollback();
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return delete;
    }
    
    public boolean hapusMatpelGuru(String nip) throws Exception {
        boolean delete = false;
        try{
            conn = getConnection();
            conn.setAutoCommit(false);
            guru.setConnection(conn);
            delete = guru.hapusGuru(nip);
            if(delete) {
                conn.commit();
            }else{
                conn.rollback();
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return delete;
    }
}
