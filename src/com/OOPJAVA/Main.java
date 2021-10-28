package com.OOPJAVA;

public class Main {
    public static void main(String[] args) {
        int total;

        dataBarang barang1 = new dataBarang();
        barang1.setNama("bolpoint");
        barang1.setStok(10);
        barang1.setHargaSatuan(2000);
        barang1.setHargaTotal(10, 2000);
        int a = barang1.getHargaTotal();

        dataBarang barang2 = new dataBarang();
        barang2.setNama("pensil");
        barang2.setStok(10);
        barang2.setHargaSatuan(1000);
        barang2.setHargaTotal(10, 1000);
        int b = barang2.getHargaTotal();

        dataBarang barang3 = new dataBarang();
        barang3.setNama("penghapus");
        barang3.setStok(10);
        barang3.setHargaSatuan(500);
        barang3.setHargaTotal(10, 500);
        int c = barang3.getHargaTotal();

        System.out.println("Data Barang");

        System.out.println("\nNama barang  : " + barang1.getNama());
        System.out.println("Stok barang  : " + barang1.getStok());
        System.out.println("Harga satuan : " + barang1.getHargaSatuan());
        System.out.println("Total harga  : " + barang1.getHargaTotal());

        System.out.println("\nNama barang  : " + barang2.getNama());
        System.out.println("Stok barang  : " + barang2.getStok());
        System.out.println("Harga satuan : " + barang2.getHargaSatuan());
        System.out.println("Total harga  : " + barang2.getHargaTotal());

        System.out.println("\nNama barang  : " + barang3.getNama());
        System.out.println("Stok barang  : " + barang3.getStok());
        System.out.println("Harga satuan : " + barang3.getHargaSatuan());
        System.out.println("Total harga  : " + barang3.getHargaTotal());

        total = a + b + c;
        System.out.println("\nTotal uang yang di terima penjual ketika semua barang terjual adalah Rp." + total);
    }
}
