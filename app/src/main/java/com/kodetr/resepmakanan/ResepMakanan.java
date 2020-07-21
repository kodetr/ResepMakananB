package com.kodetr.resepmakanan;

public class ResepMakanan {

    private int id;
    private String nama_makanan;
    private String gambar;
    private int harga;
    private int diskon;


    public void setId(int id) {
        this.id = id;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

}
