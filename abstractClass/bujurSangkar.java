package com.abstractClass;

public class bujurSangkar extends bentuk2D{
    private int sisi;
    private int luas;
    private int keliling;

    public bujurSangkar(int sisi){
        this.sisi = sisi;
    }
    public void cetakLuas(){
        luas=sisi*sisi;
        System.out.println("Luas bujur sangkar adalah : " + luas);
    }
    public void cetakKeliling(){
        System.out.println("keliling bujur sangkar adalah : " + keliling);
    }
}
