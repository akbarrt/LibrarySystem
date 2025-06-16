package com.perpustakaan.data;

import com.perpustakaan.Action.Action;

public class Book  {
    private String NamaBuku;
    public int StokBuku;
    private String NamaPenulis;
    private String IdBook;

    public Book(String namaBuku, String idBook, String NamaPenulis, int StokBuku) {
        this.NamaBuku = namaBuku;
        this.IdBook = idBook;
        this.NamaPenulis = NamaPenulis;
        this.StokBuku = StokBuku;
    }

    public int getStokBuku() {
        return StokBuku;
    }

    public void setStokBuku(int stokBuku) {
        StokBuku = stokBuku;
    }


    public String getNamaBuku() {
        return NamaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        NamaBuku = namaBuku;
    }

    public String getNamaPenulis() {
        return NamaPenulis;
    }

    public void setNamaPenulis(String namaPenulis) {
        NamaPenulis = namaPenulis;
    }

    public String getIdBook() {
        return IdBook;
    }

    public void setIdBook(String idBook) {
        IdBook = idBook;
    }

    public void bookKurangiStok(){
        if(StokBuku > 0){
            StokBuku--;
        }
    }
    public void tambahStok(){
        StokBuku++;
    }




}
