package com.belajarMethod;

// Membuat method di dalam class
class Mahasiswa{
    // Data member
    String nama;
    String jurusan;

    // Constructor
    Mahasiswa(String nama, String jurusan){
        this.nama = nama;
        this.jurusan = jurusan;
        // Main.test();
    }

    // Method di dalam class ( Ini Method tanpa return dan tanpa parameter)
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Jurusan : " + this.jurusan);
    }

    // Method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // Method dengan return tapi tak ada parameter
    String getNama(){
        return this.nama;
    }

    String getJurusan(){
        return this.jurusan;
    }

    //method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah : " + this.nama ;
    }

    class Dosen {
        String nama;

        Dosen(String nama){
            this.nama = nama;
        }
    }
}


public class Main {
    static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("uxup", "Teknik Fesnuk");

        // Manggil Method
        mahasiswa1.show();
        // Ubah nama
        mahasiswa1.setNama("Tutut");
        mahasiswa1.show();
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getJurusan());

        String data = mahasiswa1.sayHi("Ganteng");
        System.out.println(data);
//        test();
    }

//    // Contoh method di dalam main
//    static void test(){
//        System.out.println("Ini namanya method");
//    }
}