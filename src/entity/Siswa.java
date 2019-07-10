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
public class Siswa {
    private String id_siswa;
    private String nama_siswa;

    /**
     * @return the id_siswa
     */
    public String getId_siswa() {
        return id_siswa;
    }

    /**
     * @param id_siswa the id_siswa to set
     */
    public void setId_siswa(String id_siswa) {
        this.id_siswa = id_siswa;
    }

    /**
     * @return the nama_siswa
     */
    public String getNama_siswa() {
        return nama_siswa;
    }

    /**
     * @param nama_siswa the nama_siswa to set
     */
    public void setNama_siswa(String nama_siswa) {
        this.nama_siswa = nama_siswa;
    }
    
    @Override
    public String toString(){
        return id_siswa;
    }
    
    
}
