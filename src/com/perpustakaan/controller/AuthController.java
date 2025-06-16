package com.perpustakaan.controller;

import com.perpustakaan.data.Admin;
import com.perpustakaan.data.Users;
import com.perpustakaan.data.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class AuthController {
    private LibraryController Libary;
    ArrayList<Users> users = new ArrayList<>();

    public void Datalogin() {
        users.add(new Admin("Admin402", "2024"));
        users.add(new Member("Faris", "402"));
        users.add(new Member("Bagas", "441"));
        users.add(new Member("Aril", "434"));
        System.out.println("");
    }

    public boolean login(String username, String password, boolean loginAdmin){
        for (Users user : users){
            if(loginAdmin && user instanceof Admin){
                if (user.getNama().equals(username) && user.getPassword().equals(password))
                System.out.println("Login berhasil sebagai Admin");
                ((Admin)user).TampilkanMenu(this, Libary);
                return true;
            } else if (!loginAdmin && user instanceof Member) {
                if (user.getNama().equals(username) && user.getPassword().equals(password))
                System.out.println("Login sebagai mahasiswa");
                ((Member)user).TampilkanMenu(this, Libary);
                return true;
            }
        }
        System.out.println("nama atau password salah");
        return false;
    }

    public void Register(String username, String password){
        for (Users user : users){
            if (!(user instanceof  Member) && user.getNama().equalsIgnoreCase(username)){
                System.out.println("Nama sudah dipakai");
            }
        }
        users.add(new Member(username, password));
    }

    public void TampilkanAnggota() {
        for (Users user : users ){
            if (user instanceof Member){
                user.tampilkanInformasi();
            }
        }


    }
    public void hapusMember(String Nama){
        Iterator<Users>IteratorHapusNama = users.iterator();
        boolean ditemukan = false;

        while (IteratorHapusNama.hasNext()){
            Users user = IteratorHapusNama.next();
            if (user instanceof Member && user.getNama().equalsIgnoreCase(Nama)){
                IteratorHapusNama.remove();
                System.out.println("Anggota bernama " + Nama + " Berhasil dihapus");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan){
            System.out.println("Anggota dengan nama " + Nama + " tidak ada dalam daftar");
        }
    }

    public void setLibary(LibraryController libary) {
        Libary = libary;
    }

}

