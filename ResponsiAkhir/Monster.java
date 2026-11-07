package com.ResponsiAkhir;

public class Monster extends Karakter {
    private int kekuatanSerangan;

    public Monster(String nama) {
        this(nama, 15, 80);
    }

    public Monster(String nama, int kekuatanSerangan, int hp) {
        super(nama, hp);
        this.kekuatanSerangan = Math.max(1, kekuatanSerangan);
    }

    public int getKekuatanSerangan() {
        return kekuatanSerangan;
    }

    public void setKekuatanSerangan(int kekuatanSerangan) {
        this.kekuatanSerangan = Math.max(1, kekuatanSerangan);
    }

    public void serang(Karakter target) {
        if (target == null || !target.masihHidup() || !masihHidup()) {
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
    public void prosesGiliran(Karakter target) {
        if (!masihHidup()) {
            setStatus("KALAH");
            System.out.println(getNama() + " sudah dikalahkan.");
        } else if (target != null && target.masihHidup()) {
            System.out.println("Giliran monster: " + getNama() + ".");
            serang(target);
        } else {
            setStatus("MENANG");
            System.out.println(getNama() + " memenangkan pertarungan!");
        }
    }

    @Override
    public void tampilkanStatus() {
        super.tampilkanStatus();
        System.out.println("Kekuatan serangan: " + kekuatanSerangan);
    }
}