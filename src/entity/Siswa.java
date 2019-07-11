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
    private String nis;
    private String nama_siswa;
    private String alamat;
    private String kelas;
    private String kelamin;

    /**
     * @return the id_siswa
     */
    public String getNis() {
        return nis;
    }

    /**
     * @param id_siswa the id_siswa to set
     */
    public void setNis(String nis) {
        this.nis = nis;
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
        return nis;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the kelas
     */
    public String getKelas() {
        return kelas;
    }

    /**
     * @param kelas the kelas to set
     */
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void getKelas(String kelas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the kelamin
     */
    public String getKelamin() {
        return kelamin;
    }

    /**
     * @param kelamin the kelamin to set
     */
    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }
    
    
}
