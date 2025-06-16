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
    public void TampilkanMenu(AuthController auth, LibraryController Library) {
        System.out.println("1. Tambahkan Buku");
        System.out.println("2. Lihat Anggota");
        System.out.println("3. Lihat Daftar Buku");
        int pilih = input.nextInt();
        input.nextLine();

        switch (pilih){
            case 1:
                Library.TambahBuku();
                break;
            case 2:
                auth.TampilkanAnggota();
                break;
            case 3:
                Library.LihatDaftarBuku();
        }
    }


    @Override
    public void tampilkanInformasi() {
        System.out.println(getNama());
    }


}
