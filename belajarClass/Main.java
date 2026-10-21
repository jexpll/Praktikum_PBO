package com.belajarClass;

//membuat class
class Mahasiswa{
    String nama;
    String jurusan;
}

public class Main{
    static void main(String[] args) {
        //membuat objek1
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Baratha Wijaya";
        mahasiswa1.jurusan = "Teknik informatika";

        System.out.println("Halo, perkenalkan nama saya " + mahasiswa1.nama + " Dari jurusan : " + mahasiswa1.jurusan);

        //Objek2
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa1.nama = "Rizky Marseta";
        mahasiswa1.jurusan = "Teknik informatika";

        System.out.println("Halo, perkenalkan nama saya " + mahasiswa2.nama + " Dari jurusan : " + mahasiswa2.jurusan);
    }
}