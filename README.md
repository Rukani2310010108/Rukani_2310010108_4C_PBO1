## 🩺 Manajemen Data Dokter - UAS PBO1

Proyek ini adalah contoh sederhana aplikasi **pengolahan data dokter** menggunakan bahasa pemrograman Java. Proyek ini dibuat sebagai tugas Ujian Akhir Semester mata kuliah **Pemrograman Berorientasi Objek 1 (PBO1)**, dibimbing oleh **Bapak Muhammad Edya Rosadi**.

---

## 📌 Deskripsi

Aplikasi ini menerima input dari pengguna berupa data dokter seperti:
- Nama
- Jabatan
- Nomor SIP (Surat Izin Praktik)
- Tempat kerja
- Tahun masuk
- Spesialisasi (khusus untuk dokter spesialis)

Output dari program berupa tampilan informasi dokter dalam format yang terstruktur.

---

## 🧠 Konsep OOP yang Digunakan

Aplikasi ini mengimplementasikan **konsep dasar OOP (Object-Oriented Programming)** seperti:

- ✅ Class & Object  
- ✅ Attribute & Method  
- ✅ Constructor  
- ✅ Setter (Mutator) dan Getter (Accessor)  
- ✅ Inheritance (Pewarisan class)  
- ✅ Polymorphism (Overriding dan Overloading)  
- ✅ Array  
- ✅ Perulangan  
- ✅ Scanner (Input pengguna)  
- ✅ Try-Catch (Error Handling)  

---

## 🔍 Penjelasan Kode

Berikut bagian kode dan penjelasan fitur OOP:

### 1. `Class Dokter`
Class ini memiliki atribut private seperti `nama`, `jabatan`, `sip`, `tempatKerja`, dan `tahunMasuk`.  
Dilengkapi dengan constructor, getter, dan setter.

### 2. `Class DokterSpesialis`
Merupakan class turunan dari `Dokter` yang menambahkan atribut `spesialisasi`, dan menimpa method dari class induk (`Overriding`).

### 3. `Polymorphism`
- **Overriding:** Method `penangananPasien()` diubah di class `DokterSpesialis`
- **Overloading:** Method `displayInfo()` dibuat dalam dua versi (dengan dan tanpa parameter tambahan)

### 4. `Array dan Looping`
Beberapa objek dokter disimpan dalam array, lalu ditampilkan menggunakan perulangan `for`.

### 5. `Scanner`
Menggunakan `Scanner` untuk mengambil input dari user melalui terminal.

### 6. `Try-Catch`
Blok `try-catch` digunakan untuk menangani kesalahan input, misalnya ketika tahun masuk harus berupa angka.

---

## 📁 Struktur Folder (Opsional)
