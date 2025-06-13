package com.perpustakaan.controller;
import com.perpustakaan.data.Admin;
import com.perpustakaan.data.Member;
import com.perpustakaan.data.Users;


import java.util.ArrayList;

public class AuthController {
    static ArrayList <Users> DataList = new ArrayList<>();

    public boolean Register(String Username, String Password){
        for(Users user : DataList){
            if(user.getNama().equalsIgnoreCase(Username)){
                System.out.println("nama sudah dipakai");
                return false;
            }
        }
        DataList.add(new Member(Username, Password));
        return true;
    }

    public void Login(String Username, String Password){
        DataList.add(new Admin("Admin 402", "2024" ));
        for(Users user : DataList){
            if(user.getNama().equalsIgnoreCase(Username) && user.getPassword().equals(Password)){
                System.out.println("Login berhasil");

            }
        }


    }

}
