/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import dao.MatpelDao;
import dao.SiswaDao;
import entity.MataPelajaran;
import entity.Siswa;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Daus
 */
public class SiswaService extends KoneksiDb {
    SiswaDao siswa  = new SiswaDao();
    
    MatpelDao matpel = new MatpelDao();

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
        List<MataPelajaran> list = new ArrayList<>();
        try{
            conn = getConnection();
            conn.setAutoCommit(false);
            siswa.setConnection(conn);
            matpel.setConnection(conn);
            result = siswa.insertSiswa(data);
            list = matpel.getAllMatpel();
            
            for(int i = 0 ; i < list.size(); i++){
                result = siswa.insertNilaiSiswaFirst(data, list.get(i).getId_matpel(), 1);
            }
            
            for(int i = 0 ; i < list.size(); i++){
                result = siswa.insertNilaiSiswaFirst(data, list.get(i).getId_matpel(), 2);
            }
            
            if(result){
                conn.commit();
            }else{
                conn.rollback();
            }
        }catch(Exception e){
            conn.rollback();
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
    
    public List<Siswa> getSiswaByParameter(String param) throws Exception{
        List<Siswa> list = new ArrayList<Siswa>();
        try{
            conn = getConnection();
            siswa.setConnection(conn);
            list = siswa.getSiswaByParameter(param);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return list;
    }
    
    public int valdiasiSiswa(String param) throws Exception{
        int count = 0;
        try{
            List<Siswa> list = new ArrayList<Siswa>();
            conn = getConnection();
            siswa.setConnection(conn);
            list = siswa.getSiswaByParameter(param);
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
    
    public boolean updateSiswa(Siswa data) throws Exception{
        boolean result = false;
        try{
            conn = getConnection();
            conn.setAutoCommit(false);
            siswa.setConnection(conn);
            result = siswa.updateSiswa(data);
            if(result){
                conn.commit();
            }else{
                conn.rollback();
            }
        }catch(Exception e){
            conn.rollback();
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return result;
    }
    
    public boolean hapusSiswa(String nis) throws Exception {
        boolean delete = false;
        try{
            conn = getConnection();
            conn.setAutoCommit(false);
            siswa.setConnection(conn);
            delete = siswa.hapusSiswa(nis);
            if(delete){
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
