# Java RPG Battle System

**Responsi Akhir Praktikum Pemrograman Berorientasi Objek (PBO)**.

Java RPG Battle System merupakan program game sederhana berbasis terminal yang menggunakan konsep pemrograman berorientasi objek (OOP). Dalam game ini, pemain akan bertarung melawan monster secara bergantian sampai salah satu karakter kehabisan HP.

## Identitas

- **Nama:** Baratha Wijaya K.A.
- **NIM:** H1D025171

Tema Game dipilih karena digit terakhir NIM adalah 1, sesuai dengan ketentuan pada lembar penugasan.

## Fitur Program

Beberapa fitur yang tersedia dalam program ini:

- Membuat karakter pemain dengan nama sendiri.
- Melakukan serangan terhadap monster.
- Menggunakan potion untuk memulihkan HP.
- Melihat status dan sisa HP setiap karakter.
- Menampilkan jumlah potion yang masih tersedia.
- Menentukan hasil akhir pertarungan berdasarkan kondisi HP pemain dan monster.

## Struktur Project

```text
Java_RPG_Battle/
│
├── src/
│   └── main/
│       └── com/
│         └── ResponsiAkhir/
│               ├── Karakter.java
│               ├── Pemain.java
│               ├── Monster.java
│               ├── Penyerang.java
│               ├── PenggunaPotion.java
│               └── Main.java
│               └──README.md

```

## Penerapan Konsep OOP

Dalam project ini, terdapat sepuluh konsep PBO yang diterapkan sesuai dengan persyaratan tugas.

1. **State dan Behavior**

   Menggunakan atribut seperti nama, HP, status, dan kekuatan serangan. Beberapa method yang digunakan antara lain `serang()`, `gunakanPotion()`, dan `tampilkanStatus()`.

2. **Immutability**

   Menggunakan `public static final` pada konstanta `HP_MAKSIMUM` dan `private final` pada atribut `idKarakter`.

3. **Enkapsulasi dan Overloading**

   Seluruh atribut dibuat private dan diakses melalui getter dan setter. Terdapat juga penggunaan `this` serta constructor dengan parameter yang berbeda.

4. **Inheritance**

   Class `Pemain` dan `Monster` mewarisi class `Karakter` menggunakan keyword `extends`.

5. **Super Chaining**

   Menggunakan `super()` untuk memanggil constructor superclass dan `super.tampilkanStatus()` untuk memanggil method dari superclass.

6. **Method Overriding**

   Menggunakan anotasi `@Override` untuk menimpa method yang berasal dari superclass.

7. **Abstract Class**

   Class `Karakter` dibuat sebagai abstract class dan memiliki abstract method `prosesGiliran()`.

8. **Logika State Percabangan**

   Menggunakan `if/else` pada method `prosesGiliran()` untuk memeriksa kondisi HP dan mengubah status karakter.

9. **Polimorfisme Interface**

   Memanggil method melalui variabel referensi bertipe interface, yaitu `Penyerang` dan `PenggunaPotion`.

10. **Multiple Interface**

    Class `Pemain` mengimplementasikan dua interface sekaligus, yaitu `Penyerang` dan `PenggunaPotion`.

## Cara Menjalankan Program

Project dapat dijalankan menggunakan IntelliJ IDEA dengan langkah berikut:

1. Buka IntelliJ IDEA.
2. Pilih **Open** dan arahkan ke folder project.
3. Pastikan JDK sudah terpasang.
4. Buka folder `src/main/java/rpg`.
5. Jalankan file `Main.java` dengan menekan tombol Run.

### Compile dan Run melalui Terminal

Pastikan terminal berada di direktori utama project.

Jalankan program:

```bash
java -cp out rpg.Main
```

Atau bisa di Debug dengan tombol Start / Serangga

## Hasil Program

Berikut merupakan tempat untuk menampilkan screenshot hasil program setelah dijalankan.

![Output Java RPG Battle](screenshots/output-program.png)

---

Project ini dibuat sebagai bentuk penerapan materi Pemrograman Berorientasi Objek menggunakan Java, khususnya dalam penggunaan class, object, inheritance, encapsulation, abstraction, interface, dan polymorphism.