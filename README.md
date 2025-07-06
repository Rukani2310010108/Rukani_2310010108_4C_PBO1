# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data dokter menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa data dokter, baik dokter umum maupun dokter spesialis. Output yang diberikan berupa informasi lengkap dari setiap dokter, termasuk status berdasarkan tahun masuk dan pencarian berdasarkan spesialisasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, ArrayList, dan Error Handling.

## Penjelasan Kode

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Dokter`, `DokterSpesialis`, dan `Dokterpenanganan` adalah contoh dari class.

```java
public class Dokter { ... }
public class DokterSpesialis extends Dokter { ... }
public class Dokterpenanganan { ... }

    bject adalah instance dari class. Contoh pembuatan object:

Dokter d = new Dokter("Rukani", "Umum", "12345", "RS Banjarbaru", 2017);

    Atribut adalah variabel yang ada dalam class. Contohnya:

private String nama;
private String jabatan;

    Constructor adalah method yang pertama kali dijalankan pada saat pembuatan object.

public Dokter(String nama, String jabatan, String sip, String tempatKerja, int tahunMasuk) {
    this.nama = nama;
    ...
}

    Mutator atau setter digunakan untuk mengubah nilai dari suatu atribut.

public void setNama(String nama) {
    this.nama = nama;
}

    Accessor atau getter digunakan untuk mengambil nilai dari suatu atribut.

public String getNama() {
    return nama;
}

    Encapsulation adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method.

private String sip; // hanya bisa diakses via getter/setter

    Inheritance adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain.

public class DokterSpesialis extends Dokter {
    ...
}

    Polymorphism terdiri dari Overriding dan Overloading.

// Overriding
@Override
public String displayInfo() {
    return super.displayInfo() + "\nSpesialisasi : " + spesialisasi;
}

// Overloading
public String displayInfo(boolean tampilStatus) {
    String info = displayInfo();
    if (tampilStatus) {
        info += "\nStatus Dokter : " + statusDokter();
    }
    return info;
}

    Seleksi digunakan untuk menentukan status dokter berdasarkan tahun masuk.

if (tahunMasuk < 2015) return "Dokter Senior";
else if (tahunMasuk < 2020) return "Dokter Madya";
else return "Dokter Baru";

    Perulangan digunakan untuk input data dokter secara berulang.

for (int i = 0; i < jumlah; i++) {
    System.out.println("Data Dokter ke-" + (i + 1));
    ...
}

    IO Sederhana digunakan untuk menerima input dari user dan menampilkan output.

Scanner input = new Scanner(System.in);
System.out.print("Masukkan Nama Dokter: ");
String nama = input.nextLine();

    ArrayList digunakan untuk menyimpan list dinamis dari objek dokter.

ArrayList<Dokter> daftarDokter = new ArrayList<>();

    Error Handling digunakan untuk menangani input yang salah.

try {
    tahunMasuk = input.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Input harus berupa angka!");
    input.nextLine();
}

Usulan nilai
No	Materi	Nilai
1	Class	5
2	Object	5
3	Atribut	5
4	Constructor	5
5	Mutator	5
6	Accessor	5
7	Encapsulation	5
8	Inheritance	5
9	Polymorphism	10
10	Seleksi	5
11	Perulangan	5
12	IO Sederhana	10
13	ArrayList	10
14	Error Handling	15
	TOTAL	100
Pembuat

Nama: Rukani
NPM/ 2310010108
Dosen/Guru Pembimbing: Bapak Muhammad Edya Rosadi
