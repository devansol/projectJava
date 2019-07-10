/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Daus
 */
public class MataPelajaran {
    private String id_matpel;
    private String nama_matpel;

    /**
     * @return the id_matpel
     */
    public String getId_matpel() {
        return id_matpel;
    }

    /**
     * @param id_matpel the id_matpel to set
     */
    public void setId_matpel(String id_matpel) {
        this.id_matpel = id_matpel;
    }

    /**
     * @return the nama_matpel
     */
    public String getNama_matpel() {
        return nama_matpel;
    }

    /**
     * @param nama_matpel the nama_matpel to set
     */
    public void setNama_matpel(String nama_matpel) {
        this.nama_matpel = nama_matpel;
    }
    
    @Override
    public String toString(){
        return id_matpel;
    }
}
