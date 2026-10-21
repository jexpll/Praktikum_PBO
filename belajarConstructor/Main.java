package com.belajarConstructor;

//class tanpa constructor
class Polos{
    String dataString;
    int dataInteger;
}

//class dengan constructor
class Mahasiswa{
    String nama;
    String jurusan;
    String fakultas;
    // Construcor
    Mahasiswa(String inputNama, String inputJurusan, String inputFakultas){
        nama = inputNama;
        jurusan = inputJurusan;
        fakultas = inputFakultas;

        System.out.println(nama);
        System.out.println(jurusan);
        System.out.println(fakultas);
    }
}

public class Main{
    static void main(String[] args) {

        // object constructor di panggill
        new Mahasiswa("Wawan roket","Analis data", "Fakultas Ilmu Analis dan Rodok");
        new Mahasiswa("Akmal","Perikanan", "Fakultas perikanan");

        //pemanggilan object tanpa constructor
//        Mahasiswa mahasiswa1 = new Mahasiswa();
//        Polos objectPolos = new Polos();
//        objectPolos.dataString = "Ini String";
//        objectPolos.dataInteger = 12;
//
//        System.out.println("Ini Isinya : " + objectPolos.dataString + objectPolos.dataInteger);
    }
}