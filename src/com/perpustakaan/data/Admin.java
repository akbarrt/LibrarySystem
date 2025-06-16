package com.perpustakaan.data;
import com.perpustakaan.controller.AuthController;
import com.perpustakaan.controller.LibraryController;

import java.util.Scanner;

public class Admin extends Users{
    LibraryController controller = new LibraryController();
    AuthController authController =new AuthController();


    public Admin(String Nama, String Password) {
        super(Nama, Password);
    }

    @Override
    public void TampilkanMenu(AuthController auth) {
        int pilih;
        do {
            System.out.println("1. Tambahkan Buku");
            System.out.println("2. Lihat Anggota");
            System.out.println("3. Lihat Daftar Buku");
            System.out.print("Pilihan Anda: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    controller.TambahBuku();

                    break;
                case 2:
                    auth.TampilkanAnggota();
                    break;
                case 3:
                    controller.LihatDaftarBuku();
                    break;
            }
        }while(pilih != 0);
    }


    @Override
    public void tampilkanInformasi() {
        System.out.println(getNama());
    }


}
