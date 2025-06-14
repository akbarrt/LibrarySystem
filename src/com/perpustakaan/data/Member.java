package com.perpustakaan.data;

import com.perpustakaan.controller.AuthController;

public class Member extends Users{
    public Member(String Nama, String Password) {
        super(Nama, Password);
    }

    @Override
    public void TampilkanMenu(AuthController auth) {
        System.out.println("1. Meminjam buku");
        System.out.println("2. Mengambalikan buku");
        int pilih = input.nextInt();
        input.nextLine();

        switch (pilih){
            case 1:
                System.out.println("Meminjam Buku.");
                break;
            case 2:
                System.out.println("Mengembalikan Buku");
                break;
        }
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println(getNama());
    }
}
