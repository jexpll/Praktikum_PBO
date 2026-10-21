package com.praktikuMinheritance;

public class Sepeda {
    public int pedal;
    public int gear;
    public int kecepatan;
    private int standar;

    public Sepeda (int pedal, int gear, int kecepatan, int standar){
        this.pedal = pedal;
        this.gear = gear;
        this.kecepatan = kecepatan;
    }

    public Sepeda() {
    }

    public void remSepeda(int nilaiPengereman){
        kecepatan= kecepatan - nilaiPengereman;
    }

    public void tambahKeceparan(int nilaiTambah){
        kecepatan = kecepatan + nilaiTambah;
    }
}
