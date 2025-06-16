package com.perpustakaan.data;
import com.perpustakaan.controller.AuthController;
import com.perpustakaan.controller.LibraryController;
import com.perpustakaan.main.LoginSystem;

import java.util.Scanner;

public class Admin extends Users{
    LibraryController controller = new LibraryController();
    AuthController authController =new AuthController();


    public Admin(String Nama, String Password) {
        super(Nama, Password);
    }

    @Override
    public void TampilkanMenu(AuthController auth, LibraryController Library) {
        int pilih;
        do {
            System.out.println("1. Tambahkan Buku");
            System.out.println("2. Lihat Anggota");
            System.out.println("3. Lihat Daftar Buku");
            System.out.println("4. Hapus Anggota");
            System.out.println("0. Logout");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    Library.TambahBuku();
                    break;
                case 2:
                    auth.TampilkanAnggota();
                    break;
                case 3:
                    Library.LihatDaftarBuku();
                    break;
                case 4:
                    System.out.println("masukkan nama: ");
                    String NamaHapus = input.nextLine();

                    auth.HapusAnggota(NamaHapus);
                    break;
                case 0:
                    LoginSystem.menuAwal();
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
        }while (pilih != 0);
    }


    @Override
    public void tampilkanInformasi() {
        System.out.println(getNama());
    }


}
