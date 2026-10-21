package com.praktikum;

class Orang {
    private int tahunUmur = 32;
    public void hitungUmur(){
        int hariUmur = tahunUmur * 365;
        long detikUmur  = tahunUmur * 365 * 245L * 60 * 60;
        System.out.println("umur anda adalah : " + hariUmur + "Hari");
        System.out.println("umur anda adalah : " + detikUmur + "detik");
    }
}

class bujurSangkar {
    int hitungLuas(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    int hitungKeliling (int sisi) {
        int luas = 4;
        int keliling = 4 * luas;
        return (luas);
    }
}

class Persegi {
    int hitungLuas(int panjang, int lebar){
        int luas = panjang * lebar;
        return (luas);
    }
    int hitungKeliling(int panjang, int lebar){
        int keliling = panjang * lebar;
        return (keliling);
    }
}

//class finalWord{
//    final double phi= 3.14;
//    double kelilingLingkaran(double){
//
//    }
//}


class Uji{
    static void main(String[] args) {
        int x;
        bujurSangkar bujur = new bujurSangkar();
        x = bujur.hitungLuas(4);
        System.out.println("luas bujur sangkar " + x);
        x =bujur.hitungKeliling(5);
        System.out.println("keliling bujur sangkar " + x);
        Persegi persegipanjang=new Persegi();
        x = persegipanjang.hitungLuas(6,4);
        System.out.println("Keliling persegi " +x);
    }
}

class Main{
    static void main(String[] args) {
        Orang o = new Orang();
        Orang objOrang = new Orang();

        objOrang.hitungUmur();
        o.hitungUmur();
    }
}



