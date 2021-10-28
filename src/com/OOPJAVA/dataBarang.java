package com.OOPJAVA;

public class dataBarang {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int hargaTotal;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(int stok, int hargaSatuan) {
        this.hargaTotal = stok * hargaSatuan;
    }
}
