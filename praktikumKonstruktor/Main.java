package com.praktikumKonstruktor;

public class Main {
    static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa("Daplun", "H1H1H1H1");
        mhs1.setAlamat();
        System.out.println(mhs1.getAlamat());
        mhs1.cetakInformasi();

        Mahasiswa mhs2 = new Mahasiswa("Daplun", "H1H1H1H1");
        System.out.println(mhs2.getNama());
    }
}