package com.perpustakaan.main;
import com.perpustakaan.controller.*;
import com.perpustakaan.data.Users;


import java.util.Scanner;

// Adit
public class Main {

    // Sodiq
    static AuthController auth = new AuthController();
    static LibraryController libraryController = new LibraryController();

    public static void main(String[] args) {
        libraryController.LibryData();
        auth.Datalogin();
        auth.setLibary(libraryController);
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
                boolean MemberBerhasil = false;
                while (!MemberBerhasil) {
                    System.out.println("masukkan nama: ");
                    String nama = input.nextLine();
                    System.out.println("masukkan Password");
                    String Password = input.nextLine();

                    MemberBerhasil = auth.login(nama, Password, false);
                    if (!MemberBerhasil) {
                        System.out.println("Login gagal");
                    }
                }
                break;

            case 2:
                System.out.println("Masukkan nama: ");
                String Username = input.nextLine();
                System.out.println("Masukkan Password: ");
                String password = input.nextLine();

                auth.Register(Username, password);
                menuAwal();
                break;
            case 3:
                // login admin
                boolean BerhasilAdmin = false;
                while (!BerhasilAdmin) {
                    System.out.println("Masukkan nama: ");
                    String AdminNama = input.nextLine();
                    System.out.println("masukkan passwrod: ");
                    String AdminPassword = input.nextLine();

                    BerhasilAdmin = auth.login(AdminNama, AdminPassword, false);
                    if (!BerhasilAdmin) {
                        System.out.println("Username atau false salah");
                    }
                }
                break;
            default:
                System.out.println("pilihan tidak valid");
        }
    }
}
