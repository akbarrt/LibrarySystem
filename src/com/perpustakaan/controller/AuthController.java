package com.perpustakaan.controller;
import com.perpustakaan.data.Admin;
import com.perpustakaan.data.Member;
import com.perpustakaan.data.Users;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AuthController {
    // nyimpen data user
    private LibraryController Library;
    ArrayList<Users> users =  new ArrayList<>();

    public void DataLogin(){
        users.add(new Admin("Admin402","2024"));
        users.add(new Member("Faris","402"));
        users.add(new Member("Bagas","441"));
        users.add(new Member("Ariel","434"));
    }

    // login
    public boolean Login(String username,String password, boolean loginAdmin){
        for(Users user : users){
            if(loginAdmin && user instanceof Admin){
                if(user.getNama().equals(username) && user.getPassword().equals(password)){
                    System.out.println("login berhasil sebagai admin");
                    ((Admin) user).TampilkanMenu(this, Library);
                    return true;
                }
            }else if(!loginAdmin && user instanceof Member){
                if (user.getNama().equalsIgnoreCase(username) && user.getPassword().equals(password)){
                    System.out.println("login berhasil sebagai meber");
                    ((Member) user).TampilkanMenu(this, Library);
                    return true;
                }
            }
        }
        return false;
    }
    // register
    public void Register(String Username, String Password){
        for(Users user: users){
            if(!(user instanceof Member) && user.getNama().equalsIgnoreCase(Username)){
                System.out.println("nama sudah dipakai");
                break;
            }
        }
        users.add(new Member(Username, Password));

    }

    // show member
    public void TampilkanAnggota(){
        for (Users user : users){
            if(user instanceof Member){
                user.tampilkanInformasi();
            }
        }
    }
    public void setLibrary(LibraryController Library){
        this.Library = Library;
    }

    public void HapusAnggota(String Nama){
        Iterator <Users> IteratorNamaHapus = users.iterator();
        boolean ditemukan = false;

        while (IteratorNamaHapus.hasNext()){
            Users user =IteratorNamaHapus.next();
            if(user instanceof Member && user.getNama().equalsIgnoreCase(Nama)){
                IteratorNamaHapus.remove();
                System.out.println("Anggota bernama " +Nama + " Berhasil dihapus");
                ditemukan = true;
                break;
            }
        }
        if(!ditemukan){
            System.out.println("Anggota dengan nama " + Nama + " tidak ada dalam database");
        }

    }
}