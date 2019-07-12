/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.MataPelajaran;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import dao.MatpelDao;
/**
 *
 * @author Daus
 */
public class MatpelService extends KoneksiDb {
    MatpelDao matpel = new MatpelDao();
    
    public List<MataPelajaran> getAllMatpel() throws Exception{
        List<MataPelajaran> list = new ArrayList<MataPelajaran>();
        try{
            conn = getConnection();
            matpel.setConnection(conn);
            list = matpel.getAllMatpel();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            conn.close();
        }
        return list;
    }
}
