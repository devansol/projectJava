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
public class NilaiEntity {
    private String nis;
    private String id_matpel;
    private int nilai_uas;
    private int nilai_uts;
    private int nilai_tugas;
    private String tahun_ajaran;
    private int semester;

    /**
     * @return the nis
     */
    public String getNis() {
        return nis;
    }

    /**
     * @param nis the nis to set
     */
    public void setNis(String nis) {
        this.nis = nis;
    }

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
     * @return the nilau_uas
     */
    public int getNilai_uas() {
        return nilai_uas;
    }

    /**
     * @param nilau_uas the nilau_uas to set
     */
    public void setNilai_uas(int nilau_uas) {
        this.nilai_uas = nilau_uas;
    }

    /**
     * @return the nilai_uts
     */
    public int getNilai_uts() {
        return nilai_uts;
    }

    /**
     * @param nilai_uts the nilai_uts to set
     */
    public void setNilai_uts(int nilai_uts) {
        this.nilai_uts = nilai_uts;
    }

    /**
     * @return the nilai_tugas
     */
    public int getNilai_tugas() {
        return nilai_tugas;
    }

    /**
     * @param nilai_tugas the nilai_tugas to set
     */
    public void setNilai_tugas(int nilai_tugas) {
        this.nilai_tugas = nilai_tugas;
    }

    /**
     * @return the tahun_ajaran
     */
    public String getTahun_ajaran() {
        return tahun_ajaran;
    }

    /**
     * @param tahun_ajaran the tahun_ajaran to set
     */
    public void setTahun_ajaran(String tahun_ajaran) {
        this.tahun_ajaran = tahun_ajaran;
    }

    /**
     * @return the semester
     */
    public int getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    
}
