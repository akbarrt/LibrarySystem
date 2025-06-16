package com.perpustakaan.data;
import com.perpustakaan.controller.AuthController;
import com.perpustakaan.controller.LibraryController;
import com.perpustakaan.main.Main;

import java.util.Scanner;

public class Admin extends Users{
    static LibraryController controller = new LibraryController();
    static AuthController authController =new AuthController();


    public Admin(String Nama, String Password) {
        super(Nama, Password);
    }

    @Override
    public void TampilkanMenu(AuthController auth, LibraryController Libary) {
        int pilih;
        do {
            System.out.println("Pilih menu : ");
            System.out.println("1. Tambahkan Buku");
            System.out.println("2. Lihat Anggota");
            System.out.println("3. Lihat Daftar Buku");
            System.out.println("4. Hapus Anggota");
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
                    controller.LihatBuku();
                case 4:
                    System.out.println("Hapus Nama : ");
                    String NamaHapus = input.nextLine();
                    auth.hapusMember(NamaHapus);
                    break;
                case 0:
                    Main.menuAwal();
                    break;
                default:
                    System.out.println("Tidak valid");
            }
        }while (pilih != 0);
    }


    @Override
    public void tampilkanInformasi() {
        System.out.println(getNama());
    }


}
