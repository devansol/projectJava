/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.NilaiDao;
import entity.NilaiEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Daus
 */
public class NilaiService extends KoneksiDb {
    NilaiDao dao = new NilaiDao();
    
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
    
}
