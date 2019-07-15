/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.NilaiDao;

/**
 *
 * @author Daus
 */
public class NilaiService extends KoneksiDb {
    NilaiDao dao = new NilaiDao();
    
     public boolean insertNilai(int id_siswa, int id_matpel, int nilai, String tahun_ajaran) throws Exception {
         boolean result = false;
         try{
            conn = getConnection();
            conn.setAutoCommit(false);
            dao.setConnection(conn);
            result = dao.insertNilai(id_siswa, id_matpel, nilai, tahun_ajaran);
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
    
}
