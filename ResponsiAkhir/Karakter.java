package com.ResponsiAkhir;

public abstract class Karakter {
    public static final int HP_MAKSIMUM = 100;

    private final String idKarakter;
    private String nama;
    private int hp;
    private String status;

    public Karakter(String nama) {
        this(nama, HP_MAKSIMUM);
    }

    public Karakter(String nama, int hp) {
        this.idKarakter = "KAR-" + System.nanoTime();
        this.nama = nama;
        this.hp = Math.max(0, Math.min(hp, HP_MAKSIMUM));
        this.status = "AKTIF";
    }

    public String getIdKarakter() {
        return idKarakter;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, Math.min(hp, HP_MAKSIMUM));
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean masihHidup() {
        return hp > 0;
    }

    public void tampilkanStatus() {
        System.out.println(nama + " | HP: " + hp + "/" + HP_MAKSIMUM
                + " | Status: " + status);
    }

    public abstract void prosesGiliran(Karakter target);
}