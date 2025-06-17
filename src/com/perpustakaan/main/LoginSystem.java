package com.perpustakaan.main;
import com.perpustakaan.controller.*;


import java.util.Scanner;

// Adit
public class LoginSystem {
    static AuthController authController = new AuthController();
    static LibraryController Library =new LibraryController();
    public static void main(String[] args) {
        authController.DataLogin();
        authController.setLibrary(Library);
        Library.LibryData();

        menuAwal();
    }

    //tampilna awal
    public static void menuAwal() {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Login Member");
        System.out.println("2. Daftar Member");
        System.out.println("3. Login Admin");
        System.out.print("pilih opsi: ");
        int pilih = input.nextInt();
        input.nextLine();

        switch (pilih) {
            case 1:
                // login member
                boolean MemberBerhasil = false;
                while (!MemberBerhasil) {
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String Password = input.nextLine();

                    MemberBerhasil = authController.Login(nama, Password, false);
                    if(!MemberBerhasil){
                        System.out.println("Login gagal, Nama atau password salah");
                    }
                }
                break;
            case 2:
                //register member
                System.out.print("Masukkan Nama: ");
                String Username = input.nextLine();
                System.out.print("Masukkan Password: ");
                String password = input.nextLine();

                authController.Register(Username, password);
                menuAwal();
                break;
            case 3:
                // login admin
                boolean BerhasilLoginAdmin = false;
                while (!BerhasilLoginAdmin) {
                    System.out.print("Masukkan Username: ");
                    String AdminNama = input.nextLine();
                    System.out.print("Masukkan passwrod: ");
                    String AdminPassword = input.nextLine();

                    BerhasilLoginAdmin = authController.Login(AdminNama, AdminPassword, true);
                    if(!BerhasilLoginAdmin){
                        System.out.println("login gagal, Nama atau password salah");
                    }
                }
                break;
            default:
                System.out.println("pilihan tidak valid");
        }
    }
}
