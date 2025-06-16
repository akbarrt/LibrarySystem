package com.perpustakaan.main;
import com.perpustakaan.controller.*;
import com.perpustakaan.data.Users;


import java.util.Scanner;

public class Main {
    static AuthController authController = new AuthController();
    public static void main(String[] args) {
        menuAwal();
    }


    //tampilna awal
    public static void menuAwal() {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Login Member");
        System.out.println("2. Daftar");
        System.out.println("3. Login Admin");
        System.out.println("pilih opsi");
        int pilih = input.nextInt();
        input.nextLine();

        switch (pilih) {
            case 1:
                // login member
                System.out.println("masukkan nama: ");
                String nama = input.nextLine();
                System.out.println("masukkan Password");
                String Password = input.nextLine();

                authController.Login(nama, Password,false);
                break;
            case 2:
                System.out.println("Masukkan nama: ");
                String Username = input.nextLine();
                System.out.println("Masukkan Password: ");
                String password = input.nextLine();

                authController.Register(Username, password);
                menuAwal();
                break;
            case 3:
                // login admin
                System.out.println("Masukkan nama: ");
                String AdminNama = input.nextLine();
                System.out.println("masukkan passwrod: ");
                String AdminPassword = input.nextLine();

                authController.Login(AdminNama, AdminPassword,true);
        }
    }
}
