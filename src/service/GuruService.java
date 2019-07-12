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
            e.printStackTrace();
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
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return result;
    }
}