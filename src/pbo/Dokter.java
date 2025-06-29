package pbo;

//class Dokter
public class Dokter {
    // === ATRIBUT ===
    private String nama;
    private String jabatan;
    private String sip;
    private String tempatKerja;
    private int tahunMasuk;

    // === CONSTRUCTOR ===
    public Dokter(String nama, String jabatan, String sip, String tempatKerja, int tahunMasuk) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.sip = sip;
        this.tempatKerja = tempatKerja;
        this.tahunMasuk = tahunMasuk;
    }

    // === MUTATOR (SETTER) ===
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    public void setTempatKerja(String tempatKerja) {
        this.tempatKerja = tempatKerja;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    // === ACCESSOR (GETTER) ===
    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getSip() {
        return sip;
    }

    public String getTempatKerja() {
        return tempatKerja;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    // === METHOD TAMPILKAN DATA ===
    public String displayInfo() {
        return "Nama Dokter    : " + getNama() +
               "\nJabatan        : " + getJabatan() +
               "\nSIP            : " + getSip() +
               "\nTempat Kerja   : " + getTempatKerja() +
               "\nTahun Masuk    : " + getTahunMasuk();
    }

    // === METHOD SELEKSI STATUS ===
    public String statusDokter() {
        if (tahunMasuk < 2015) {
            return "Dokter Senior";
        } else if (tahunMasuk < 2020) {
            return "Dokter Madya";
        } else {
            return "Dokter Baru";
        }
    }
}