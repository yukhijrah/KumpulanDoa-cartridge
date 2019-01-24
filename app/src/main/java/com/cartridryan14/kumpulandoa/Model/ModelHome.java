package com.cartridryan14.kumpulandoa.Model;

public class ModelHome {
    private String jadwal;
    private String waktu;

    /* *Constructor * Menginisialisasikan Variable  */
    public ModelHome(String jadwal, String waktu) {
        this.jadwal = jadwal;
        this.waktu = waktu;
    }

    public String getJadwal() {
        return jadwal;
    }

    public String getWaktu() {
        return waktu;
    }
}