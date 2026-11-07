package com.ResponsiAkhir;

public class Pemain extends Karakter
        implements Penyerang, PenggunaPotion {

    private int kekuatanSerangan;
    private int jumlahPotion;

    public Pemain(String nama) {
        this(nama, 20, 3);
    }

    public Pemain(String nama, int kekuatanSerangan, int jumlahPotion) {
        super(nama);
        this.kekuatanSerangan = Math.max(1, kekuatanSerangan);
        this.jumlahPotion = Math.max(0, jumlahPotion);
    }

    public int getKekuatanSerangan() {
        return kekuatanSerangan;
    }

    public void setKekuatanSerangan(int kekuatanSerangan) {
        this.kekuatanSerangan = Math.max(1, kekuatanSerangan);
    }

    public int getJumlahPotion() {
        return jumlahPotion;
    }

    public void setJumlahPotion(int jumlahPotion) {
        this.jumlahPotion = Math.max(0, jumlahPotion);
    }

    @Override
    public void serang(Karakter target) {
        if (target == null || !target.masihHidup() || !masihHidup()) {
            System.out.println("Serangan tidak dapat dilakukan.");
            return;
        }

        target.setHp(target.getHp() - kekuatanSerangan);

        System.out.println(getNama() + " menyerang " + target.getNama()
                + " sebesar " + kekuatanSerangan + " damage.");

        if (!target.masihHidup()) {
            target.setStatus("KALAH");
            System.out.println(target.getNama() + " telah dikalahkan!");
        }
    }

    @Override
    public void gunakanPotion() {
        if (!masihHidup()) {
            System.out.println("Pemain tidak dapat menggunakan potion.");
        } else if (jumlahPotion <= 0) {
            System.out.println("Potion sudah habis.");
        } else if (getHp() == HP_MAKSIMUM) {
            System.out.println("HP masih penuh. Potion tidak digunakan.");
        } else {
            setHp(getHp() + 30);
            jumlahPotion--;

            System.out.println("Potion digunakan. HP pemain sekarang: " + getHp());
        }
    }

    @Override
    public void prosesGiliran(Karakter target) {
        if (!masihHidup()) {
            setStatus("KALAH");
            System.out.println(getNama() + " tidak dapat melanjutkan pertarungan.");
        } else if (target != null && target.masihHidup()) {
            System.out.println("Giliran " + getNama() + ".");
        } else {
            setStatus("MENANG");
            System.out.println(getNama() + " memenangkan pertarungan!");
        }
    }

    @Override
    public void tampilkanStatus() {
        super.tampilkanStatus();
        System.out.println("Potion tersedia: " + jumlahPotion);
    }
}