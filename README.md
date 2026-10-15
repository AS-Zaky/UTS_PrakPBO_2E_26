# UTS Praktikum PBO: Game Kooperatif

Project ini adalah implementasi tema **Team Solve Game Kooperatif** untuk UTS Praktikum Pemrograman Berorientasi Objek (PBO). Setiap anggota tim membuat package sendiri, lalu saling meng-import package milik anggota lain.

## Anggota Tim

| Nama | NIM | Package | Tanggung Jawab |
|---|---|---|---|
| [Akhmad Sultan Zaky] | [254107020183] | `game.tim1` | `Karakter1`, `MainTim1` |
| [Carlos Rama] | [254107020] | `game.tim2` | `Karakter2`, `MainTim2` |

## Struktur Folder

```
UTS_PrakPBO/
├── .vscode/
│   └── settings.json       # Konfigurasi VS Code
├── bin/                    # Hasil compile (.class)
│   ├── game/
│   │   ├── core/
│   │   ├── tim1/
│   │   └── tim2/
│   └── App.class
├── lib/                    # Library eksternal (jika ada)
├── src/                    # Source code (.java)
│   ├── game/
│   │   ├── core/
│   │   │   └── Karakter.java       # Superclass bersama
│   │   ├── tim1/
│   │   │   ├── Karakter1.java      # Extends Karakter
│   │   │   └── MainTim1.java       # Main class anggota 1
│   │   └── tim2/
│   │       ├── Karakter2.java      # Extends Karakter
│   │       └── MainTim2.java       # Main class anggota 2
│   └── App.java                    # Entry point
└── README.md
```

## Deskripsi Package

- **`game.core`**: Berisi `Karakter`, superclass yang diwarisi oleh `Karakter1` dan `Karakter2`. Atribut umum (misalnya nama, stamina, posisi) didefinisikan di sini.
- **`game.tim1`**: Berisi `Karakter1` (bisa loncat dan merunduk) dan `MainTim1` sebagai skenario permainan.
- **`game.tim2`**: Berisi `Karakter2` (bisa lari dan menginjak musuh) dan `MainTim2` sebagai skenario permainan.
- **`App`**: Entry point untuk menjalankan permainan.

## Konsep OOP yang Diterapkan

| Konsep | Penerapan |
|---|---|
| Class & Object | `Karakter1`, `Karakter2`, dan objek dibuat di Main |
| Enkapsulasi | Atribut `private`, diakses lewat getter/setter atau method public |
| Relasi Kelas | `Karakter1` dan `Karakter2` saling menyimpan referensi sebagai partner |
| Pewarisan | `Karakter1` dan `Karakter2` extends `Karakter` |
| Overriding | Method dari `Karakter` di-override di subclass |
| Overloading | Contoh: `loncat()` dan `loncat(int tinggi)`,
