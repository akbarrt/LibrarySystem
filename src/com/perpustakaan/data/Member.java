package com.perpustakaan.data;

import com.perpustakaan.controller.AuthController;
import com.perpustakaan.controller.LibraryController;
import com.perpustakaan.main.Main;

public class Member extends Users{
    public Member(String Nama, String Password) {
        super(Nama, Password);
    }
   // LibraryController lib = new LibraryController();

    @Override
    public void TampilkanMenu(AuthController auth, LibraryController Libary) {
        System.out.println("1. Meminjam buku");
        System.out.println("2. Mengambalikan buku");
        System.out.println("3. Log Out");
        int pilih = input.nextInt();
        input.nextLine();
        do {

            switch (pilih) {
                case 1:
                    Libary.LihatBuku();

                    boolean pinjam = false;
                    //String stop = "0";

                    while (!pinjam) {
                        System.out.print("Masukkan ID Buku yang ingin dipinjam (ketik 0 untuk berhenti): ");
                        String idBook = input.nextLine();

                        if (idBook.equals(0)) {
                            System.out.println("Peminjaman buku dibatalkan");
                            break;
                        }
                        pinjam = Libary.pinjamBuku(idBook);
                    }
                    System.out.println("Meminjam Buku.");
                    break;

                case 2:
                    System.out.println("Masukan ID yang ingin dikembalikan : ");
                    String idBook = input.nextLine();

                    Libary.kembalikanBuku(idBook);
                    break;
                case 3:
                    Main.menuAwal();
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
        } while(pilih != 0);
    }


    @Override
    public void tampilkanInformasi() {
        System.out.println(getNama());
    }
}
