package com.perpustakaan.main;
import com.perpustakaan.controller.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menuAwal();

    }

    public static void menuAwal() {
        Scanner input = new Scanner(System.in);
        AuthController control = new AuthController();

        System.out.println("1. Login Member");
        System.out.println("2. Daftar");
        System.out.println("3. Login Admin");
        System.out.println("pilih opsi");
        int pilih = input.nextInt();
        input.nextLine();

        switch (pilih) {
            case 1:
                System.out.println("masukkan nama: ");
                String nama = input.nextLine();
                System.out.println("masukkan Password");
                String Password = input.nextLine();

                control.Login(nama, Password);
                break;
            case 2:
                System.out.println("Masukkan nama: ");
                String Username = input.nextLine();
                System.out.println("Masukkan Password: ");
                String password = input.nextLine();

                control.Register(Username, password);
                menuAwal();
                break;
            case 3:
                System.out.println("Masukkan nama: ");
                String AdminNama = input.nextLine();
                System.out.println("masukkan passwrod: ");
                String AdminPassword = input.nextLine();

                control.Login(AdminNama, AdminPassword);
        }
    }
}
