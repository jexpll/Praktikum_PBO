package com.ResponsiAkhir;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       JAVA RPG BATTLE");
        System.out.println("================================");

        System.out.print("Masukkan nama pemain: ");
        String nama = input.nextLine().trim();

        if (nama.isEmpty()) {
            nama = "Pahlawan";
        }

        Pemain pemain = new Pemain(nama, 25, 3);
        Monster monster = new Monster("Goblin", 12, 80);

        // Polimorfisme menggunakan referensi interface
        Penyerang aksiSerang = pemain;
        PenggunaPotion aksiPotion = pemain;

        System.out.println("\nPertarungan dimulai!");

        pemain.tampilkanStatus();
        monster.tampilkanStatus();

        while (pemain.masihHidup() && monster.masihHidup()) {
            System.out.println("\n---------------");
            System.out.println("1. Serang");
            System.out.println("2. Gunakan potion");
            System.out.println("3. Lihat status");
            System.out.print("Pilih aksi: ");

            String pilihan = input.nextLine().trim();

            switch (pilihan) {
                case "1" -> {
                    pemain.prosesGiliran(monster);

                    if (pemain.masihHidup() && monster.masihHidup()) {
                        aksiSerang.serang(monster);
                    }
                }

                case "2" -> {
                    aksiPotion.gunakanPotion();

                    if (pemain.masihHidup() && monster.masihHidup()) {
                        monster.prosesGiliran(pemain);
                    }
                }

                case "3" -> {
                    pemain.tampilkanStatus();
                    monster.tampilkanStatus();
                }

                default -> System.out.println("Pilihan tidak valid.");
            }

            if (!pemain.masihHidup() || !monster.masihHidup()) {
                break;
            }

            if ("1".equals(pilihan)) {
                monster.prosesGiliran(pemain);
            }
        }

        System.out.println("\n================================");

        if (pemain.masihHidup()) {
            pemain.setStatus("MENANG");
            System.out.println("SELAMAT! " + pemain.getNama() + " menang!");
        } else {
            pemain.setStatus("KALAH");
            System.out.println("GAME OVER! Pemain kalah.");
        }

        System.out.println("================================");

        pemain.tampilkanStatus();
        monster.tampilkanStatus();

        input.close();
    }
}