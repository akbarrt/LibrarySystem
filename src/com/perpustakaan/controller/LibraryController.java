package com.perpustakaan.controller;
import com.perpustakaan.data.*;
import java.util.Scanner;


import java.util.ArrayList;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryController {
   static ArrayList<Book> ListBook = new ArrayList<>();
   static Scanner input = new Scanner(System.in);

    public void LibryData(){
        ListBook.add(new Book("Laskar Pelangi", "B011", "Abang", "3"));
        ListBook.add(new Book("3726 MDPL", "b012", "Budi","3"));
    }
    public void TambahBuku(){
        System.out.println("Nama Buku: ");
        String NamaBuku = input.nextLine();
        System.out.println("Masukkan id buku: ");
        String IdBuku = input.nextLine();
        System.out.println("Masukkan Nama Penulis: ");
        String NamaPenulis = input.nextLine();
        System.out.println("Tambah stok buku : ");
        String stokBuku = input.nextLine();
        System.out.println("Data buku telah ditambahkan");
        System.out.println("\n");

        ListBook.add(new Book(NamaBuku, IdBuku, NamaPenulis, stokBuku));
    }
    public void LihatBuku(){
        for (Book book : ListBook){
            System.out.println("Nama : " + book.getNamaBuku() + " | ID Book : " + book.getIdBook() + " | Penulis :" + book.getNamaPenulis() + " | Stok : " + book.getStok());

        }
    }
    //tambahan
    public boolean pinjamBuku(String idBook) {
        for (Book book : ListBook) {
            if (book.getIdBook().equals(idBook)) {
                if (book.getStok() > 0) {
                    book.kurangiStok();
                    System.out.println(">> Buku \"" + book.getNamaBuku() + "\" berhasil dipinjam.");
                    return true;
                } else {
                    System.out.println(">> Stok buku habis.");
                    return false;
                }
            }
        }
        System.out.println(">> Buku tidak ditemukan.");
        return false;
    }
    //
    public boolean kembalikanBuku(String idBook) {
        for (Book book : ListBook) {
            if (book.getIdBook().equalsIgnoreCase(idBook)) {
                book.tambahStok();
                return true;
            }else {
                System.out.println("Gagal dikembalikan");
                return false;
            }
        }
        System.out.println(">> Buku tidak ditemukan dalam daftar.");
        return false;
    }
}