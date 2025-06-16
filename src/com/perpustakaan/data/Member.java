package com.perpustakaan.data;

import com.perpustakaan.controller.AuthController;
import com.perpustakaan.controller.LibraryController;

public class Member extends Users{
    LibraryController library = new LibraryController();
    public Member(String Nama, String Password) {
        super(Nama, Password);
    }

    @Override
    public void TampilkanMenu(AuthController auth) {
        int pilih;
        do {
            System.out.println("1. Meminjam buku");
            System.out.println("2. Mengambalikan buku");
            System.out.print("Pilihan Anda: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Meminjam Buku.");
                    library.LihatDaftarBuku();
                    break;
                case 2:
                    System.out.println("Mengembalikan Buku");
                    break;
                case 3:
                    System.out.println("Terimakasih");
                    break;
            }

        }while(pilih != 0);
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println(getNama());
    }
}
