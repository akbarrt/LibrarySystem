package com.perpustakaan.data;

import com.perpustakaan.controller.AuthController;
import com.perpustakaan.controller.LibraryController;

import java.util.Scanner;

public abstract class Users {
    private String Nama;
    public Scanner input=new Scanner(System.in);

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    private String Password;

    public Users(String Nama, String Password){
        this.Nama = Nama;
        this.Password = Password;
    }

    public abstract void TampilkanMenu(AuthController auth, LibraryController Library);
    public abstract void tampilkanInformasi();
}
