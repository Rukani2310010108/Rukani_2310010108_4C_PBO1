package pbo;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Dokterpenanganan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = 0;

        System.out.println("==== PROGRAM DATA DOKTER DENGAN VALIDASI ====");

        // Validasi input jumlah dokter
        while (true) {
            try {
                System.out.print("Berapa jumlah dokter yang ingin dimasukkan? ");
                jumlah = input.nextInt();
                input.nextLine(); // Buang newline
                if (jumlah <= 0) {
                    System.out.println("Jumlah harus lebih dari 0.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.nextLine(); // Clear buffer
            }
        }

        Dokter[] daftarDokter = new Dokter[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n--- Data Dokter ke-" + (i + 1) + " ---");

            System.out.print("Nama Dokter          : ");
            String nama = input.nextLine();

            System.out.print("Jabatan              : ");
            String jabatan = input.nextLine();

            System.out.print("SIP                  : ");
            String sip = input.nextLine();

            System.out.print("Tempat Kerja         : ");
            String tempatKerja = input.nextLine();

            int tahunMasuk = 0;
            while (true) {
                try {
                    System.out.print("Tahun Masuk          : ");
                    tahunMasuk = input.nextInt();
                    input.nextLine(); // Buang newline

                    if (tahunMasuk < 1950 || tahunMasuk > 2025) {
                        System.out.println("Tahun tidak logis. Coba lagi.");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Tahun harus berupa angka!");
                    input.nextLine(); // Clear buffer
                }
            }

            System.out.print("Apakah dokter spesialis? (y/n): ");
            String spesialis = input.nextLine();

            if (spesialis.equalsIgnoreCase("y")) {
                System.out.print("Bidang Spesialis     : ");
                String bidang = input.nextLine();

                daftarDokter[i] = new DokterSpesialis(nama, jabatan, sip, tempatKerja, tahunMasuk, bidang);
            } else {
                daftarDokter[i] = new Dokter(nama, jabatan, sip, tempatKerja, tahunMasuk);
            }
        }

        System.out.println("\n==== DAFTAR DOKTER TERINPUT ====");
        for (int i = 0; i < daftarDokter.length; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.println(daftarDokter[i].displayInfo());
            System.out.println("Status Dokter  : " + daftarDokter[i].statusDokter());
        }

        input.close();
    }
}