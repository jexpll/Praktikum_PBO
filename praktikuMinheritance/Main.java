package com.praktikuMinheritance;

public class Main {
    static void main(String[] args) {
        SepedaGunung Poligon = new SepedaGunung();
        Poligon.pedal = 2;
        Poligon.gear=1;
        Poligon.kecepatan=40;
        Poligon.setLampu(1);
        Poligon.setShockbreaker(2);
        Poligon.setTempatMinum(1);

        System.out.println("Jumlah gear : " + Poligon.gear + ",Jumlah pedal : " + Poligon.pedal + ", kecepatan : " + Poligon.kecepatan + ", Lampu : " + Poligon.getLampu() + ", Shockbreaker : " + Poligon.getShockbreaker());
    }
}
