/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import dao.SiswaDao;
import entity.Siswa;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Daus
 */
public class SiswaService extends KoneksiDb {
    SiswaDao siswa  = new SiswaDao();;

    public String nisSiswa() throws Exception {
        String nis = "";
        try{
            conn = getConnection();
            conn.setAutoCommit(false);
            siswa.setConnection(conn);
            nis = siswa.noSiswa();
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return nis;
    }
    
    public boolean insertSiswa(Siswa data) throws Exception{
        boolean result = false;
        try{
            conn = getConnection();
            conn.setAutoCommit(false);
            siswa.setConnection(conn);
            result = siswa.insertSiswa(data);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return result;
    }
    
    public List<Siswa> getAllSiswa() throws Exception{
        List<Siswa> list = new ArrayList<Siswa>();
        try{
            conn = getConnection();
            siswa.setConnection(conn);
            list = siswa.getAllSiswa();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return list;
    }
}
