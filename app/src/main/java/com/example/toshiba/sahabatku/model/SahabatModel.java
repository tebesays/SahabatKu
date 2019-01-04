package com.example.toshiba.sahabatku.model;

public class SahabatModel {

    private int id_shbt;
    private String nama_shbt;
    private String foto_shbt;
    private String panggilan_shbt;
    private String tlp_shbt;
    private String alamat_shbt;
    private String deskripsi_shbt;
    private String ig_shbt;

    public SahabatModel(int id_shbt, String nama_shbt, String foto_shbt, String panggilan_shbt, String tlp_shbt, String alamat_shbt, String deskripsi_shbt, String ig_shbt) {
        this.id_shbt = id_shbt;
        this.nama_shbt = nama_shbt;
        this.foto_shbt = foto_shbt;
        this.panggilan_shbt = panggilan_shbt;
        this.tlp_shbt = tlp_shbt;
        this.alamat_shbt = alamat_shbt;
        this.deskripsi_shbt = deskripsi_shbt;
        this.ig_shbt = ig_shbt;
    }

    public int getId_shbt() {
        return id_shbt;
    }

    public void setId_shbt(int id_shbt) {
        this.id_shbt = id_shbt;
    }

    public String getNama_shbt() {
        return nama_shbt;
    }

    public void setNama_shbt(String nama_shbt) {
        this.nama_shbt = nama_shbt;
    }

    public String getFoto_shbt() {
        return foto_shbt;
    }

    public void setFoto_shbt(String foto_shbt) {
        this.foto_shbt = foto_shbt;
    }

    public String getPanggilan_shbt() {
        return panggilan_shbt;
    }

    public void setPanggilan_shbt(String panggilan_shbt) {
        this.panggilan_shbt = panggilan_shbt;
    }

    public String getTlp_shbt() {
        return tlp_shbt;
    }

    public void setTlp_shbt(String tlp_shbt) {
        this.tlp_shbt = tlp_shbt;
    }

    public String getAlamat_shbt() {
        return alamat_shbt;
    }

    public void setAlamat_shbt(String alamat_shbt) {
        this.alamat_shbt = alamat_shbt;
    }

    public String getDeskripsi_shbt() {
        return deskripsi_shbt;
    }

    public void setDeskripsi_shbt(String deskripsi_shbt) {
        this.deskripsi_shbt = deskripsi_shbt;
    }

    public String getIg_shbt() {
        return ig_shbt;
    }

    public void setIg_shbt(String ig_shbt) {
        this.ig_shbt = ig_shbt;
    }
}
