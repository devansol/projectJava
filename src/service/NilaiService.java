/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.NilaiDao;
import dao.SiswaDao;
import entity.NilaiEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Daus
 */
public class NilaiService extends KoneksiDb {
    NilaiDao dao = new NilaiDao();
    
    SiswaDao siswaDao = new SiswaDao();
    
     public boolean insertNilai(NilaiEntity data) throws Exception {
         boolean result = false;
         try{
            conn = getConnection();
            conn.setAutoCommit(false);
            dao.setConnection(conn);
            result = dao.insertNilai(data);
            if(result){
                conn.commit();
            }
         }catch(Exception e){
            conn.rollback();
            throw new Exception(e.getMessage());
         }finally{
            conn.close();
         }
         return result;
     }
     
     public List<Map<String,Object>> getAllNilai() throws Exception{
         List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
         try{
            conn = getConnection();
            conn.setAutoCommit(false);
            dao.setConnection(conn);
            list = dao.getAllNilai();
         }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
         }finally{
            conn.close();
         }
         return list;
     }
     
     public List<Map<String,Object>> kelasSiswa(String nis) throws Exception{
        List<Map<String,Object>> list = new ArrayList<>();
        try{
            conn = getConnection();
            conn.setAutoCommit(false);
            dao.setConnection(conn);
            list = dao.kelasSiswa(nis);
        }catch(Exception e){
           throw new Exception(e.getMessage());
        }finally{
           conn.close();
        }
        return list;
    }
     
     public List<Map<String,Object>> getTableNilaiByNis(String param) throws Exception{
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        try{
            conn = getConnection();
            conn.setAutoCommit(false);
            dao.setConnection(conn);
            list = dao.getTableNilaiByNis(param);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
           conn.close();
        }
        return list;
    }
     
     public boolean updateNilai(NilaiEntity data) throws Exception {
         boolean result = false;
         try{
            conn = getConnection();
            conn.setAutoCommit(false);
            dao.setConnection(conn);
            result = dao.updateNilai(data);
            if(result){
                conn.commit();
            }
         }catch(Exception e){
            conn.rollback();
            throw new Exception(e.getMessage());
         }finally{
            conn.close();
         }
         return result;
     }
     
     public int validasiNilai(NilaiEntity data) throws Exception {
         int  count = 0;
         try{
             conn = getConnection();
             dao.setConnection(conn);
             count = dao.validasiNilai(data);
         }catch(Exception e){
             throw new Exception(e.getMessage());
         }finally{
             conn.close();
         }
         return count;
     }
    
}
