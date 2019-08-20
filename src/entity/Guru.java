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
public class Guru {
    private String nip;
    private String nama_guru;
    private String email;
    private String password;
    private int akses;
    private String matpel;

    /**
     * @return the nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /**
     * @return the nama_guru
     */
    public String getNama_guru() {
        return nama_guru;
    }

    /**
     * @param nama_guru the nama_guru to set
     */
    public void setNama_guru(String nama_guru) {
        this.nama_guru = nama_guru;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString(){
        return nip;
    }

    /**
     * @return the akses
     */
    public int getAkses() {
        return akses;
    }

    /**
     * @param akses the akses to set
     */
    public void setAkses(int akses) {
        this.akses = akses;
    }

    /**
     * @return the matpel
     */
    public String getMatpel() {
        return matpel;
    }

    /**
     * @param matpel the matpel to set
     */
    public void setMatpel(String matpel) {
        this.matpel = matpel;
    }
    
}
