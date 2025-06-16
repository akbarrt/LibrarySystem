package com.perpustakaan.controller;
import com.perpustakaan.data.*;
import java.util.Scanner;

import java.util.ArrayList;

public class LibraryController {
   static ArrayList<Book> ListBook = new ArrayList<>();
   static Scanner input = new Scanner(System.in);

    public void LibryData(){
        ListBook.add(new Book("Laskar Pelangi", "B011", "Abang", 3));
        //ListBook.add(new Book("3726 MDPL", "b012", "Budi"));


    }
    public void TambahBuku(){
        System.out.println("Nama Buku: ");
        String NamaBuku = input.nextLine();
        System.out.println("Masukkan id buku: ");
        String IdBuku = input.nextLine();
        System.out.println("Masukkan Nama Penulis: ");
        String NamaPenulis = input.nextLine();
        System.out.println("Stok buku: ");
        int stok = input.nextInt();

        ListBook.add(new Book(NamaBuku, IdBuku, NamaPenulis, stok));

        System.out.println("Data Buku berhasil ditambahkan");
        System.out.println();

    }

    public void LihatDaftarBuku(){
        for(Book book: ListBook){
            System.out.println("  Buku    : " + book.getNamaBuku() +
                    "\n  ID buku : " + book.getIdBook() +
                    "\n  Penulis : " + book.getNamaPenulis() +
                    "\n Stok: " + book.getStokBuku());
        }

    }
    public boolean pinjamBuku(String IdBuku){
        for(Book book : ListBook){
            if(book.getIdBook().equals(IdBuku)){
                if(book.getStokBuku() > 0){
                    book.bookKurangiStok();
                    System.out.println("buku berhasil di pinjam");
                    return true;
                }else{
                    System.out.println("stok habis");
                    return false;


                }
            }
        }
        System.out.println("buku dengan id tersbut tidak di temukan");
        return false;

    }


}
