package com.Polymorfism;

public class turunan extends dasar{
    private int y;

    public turunan(int x, int y) {
        super(x);
        this.y = y;
    }

    public void tampilkanInformasi() {
        System.out.println("Method dari class turunan");
        System.out.println("Nilai x=" + getX());
        System.out.println("Nilai y=" + y);
    }
}
