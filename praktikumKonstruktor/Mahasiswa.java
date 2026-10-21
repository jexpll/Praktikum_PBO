package com.praktikumKonstruktor;

public class Mahasiswa{
    private String Nama;
    private String NIM;
    private String Alamat;
    private int umur;
    private String Jurusan;

    public Mahasiswa(String Nama, String NIM) {
        this.Nama = Nama;
        this.NIM = NIM;
    }

    public Mahasiswa(String Nama, String NIM, String Alamat, int umur, String Jurusan){
        this.Nama = Nama;
        this.NIM = NIM;
        this.Alamat = Alamat;
        this.umur = umur;
        this.Jurusan = Jurusan;
    }

    public String getNim(){
        return NIM;
    }

    public String getNama(){
        return Nama;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public String getAlamat(){
        return Alamat;
    }

    public void setAlamat(){
        this.Alamat = Alamat;
    }

    void cetakInformasi(){
        System.out.println("Nim Mahasiswa : " + NIM + "adalah : " + Nama);
    }

    public class uji {
        static void main(String[] args) {
            Mahasiswa mhs1 = new Mahasiswa("Daplun", "H1H1H1H1");
            mhs1.setAlamat();
            System.out.println(mhs1.getAlamat());
            mhs1.cetakInformasi();
            Mahasiswa mhs2 = new Mahasiswa("Daplun", "H1H1H1H1");

            System.out.println(mhs2.getNama());
        }
    }
}