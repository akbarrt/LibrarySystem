package com.perpustakaan.data;

import com.perpustakaan.controller.AuthController;
import com.perpustakaan.controller.LibraryController;
import com.perpustakaan.main.*;

public class Member extends Users{
    static LibraryController library = new LibraryController();

    public Member(String Nama, String Password) {
        super(Nama, Password);
    }

    @Override
    public void TampilkanMenu(AuthController auth, LibraryController Library) {
        int pilih;
        do {
            System.out.println("1. Meminjam buku");
            System.out.println("2. Mengambalikan buku");
            System.out.println("3. keluar");
            System.out.print("Pilihan Anda: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Meminjam Buku.");
                    library.LihatDaftarBuku();
                    boolean pinjam = false;

                    while (!pinjam) {
                        System.out.println("Masukkan id buku: (ketik 0 untuk batal)");
                        String idBuku = input.nextLine();
                        input.nextLine();

                        if(idBuku.equals(0)){
                            System.out.println("piminjaman buu di batalkan");
                            break;

                        }
                        pinjam = library.pinjamBuku(idBuku);

                    }

                    break;
                case 2:
                    System.out.println("Mengembalikan Buku");
                    break;
                case 3:
                    LoginSystem.menuAwal();

                    break;
            }

        }while(pilih != 0);
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println(getNama());
    }
}
