package com.perpustakaan.data;

import com.perpustakaan.Action.Action;

public class Book implements Action {
    private String NamaBuku;

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

    private String NamaPenulis;

    public Book(String namaBuku, String idBook, String NamaPenulis) {
        this.NamaBuku = namaBuku;
        this.IdBook = idBook;
        this.NamaPenulis = NamaPenulis;
    }

    private String IdBook;



    @Override
    public void tampilkanMenu() {

    }


}
