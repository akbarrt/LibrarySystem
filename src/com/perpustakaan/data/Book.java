package com.perpustakaan.data;

import com.perpustakaan.Action.Action;

import java.time.LocalDate;

public class Book implements Action {
    private String NamaBuku;
    public String getNamaBuku() {
        return NamaBuku;
    }
    public void setNamaBuku(String namaBuku) {
        NamaBuku = namaBuku;
    }

    private String NamaPenulis;
    public String getNamaPenulis() {
        return NamaPenulis;
    }
    public void setNamaPenulis(String namaPenulis) {
        NamaPenulis = namaPenulis;
    }

    private String IdBook;
    public String getIdBook() {
        return IdBook;
    }
    public void setIdBook(String idBook) {
        IdBook = idBook;
    }

    private int stok = 3;
    public int getStok() {
        return stok;
    }
    public void kurangiStok() {
        if (stok > 0) stok--;
    }
    public void tambahStok() {
        stok++;
    }
    public boolean tersedia() {
        return stok > 0;
    }

    private LocalDate tanggalPinjam;
    public LocalDate getTanggalPinjam(){
        return tanggalPinjam;
    }

    public void setTanggalPinjam(LocalDate tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public Book(String namaBuku, String idBook, String NamaPenulis, String stok) {
        this.NamaBuku = namaBuku;
        this.IdBook = idBook;
        this.NamaPenulis = NamaPenulis;
    }




    @Override
    public void tampilkanMenu() {

    }
}

