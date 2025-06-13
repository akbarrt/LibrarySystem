package com.perpustakaan.data;

public abstract class Users {
    private String Nama;

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

    public abstract void TampilkanMenu();

}
