package pbo;

//class turunan dari Dokter (Inheritance)
public class DokterSpesialis extends Dokter {
    // Atribut tambahan
    private String spesialisasi;

    // Constructor
    public DokterSpesialis(String nama, String jabatan, String sip, String tempatKerja, int tahunMasuk, String spesialisasi) {
        // Memanggil constructor dari superclass (Dokter)
        super(nama, jabatan, sip, tempatKerja, tahunMasuk);
        this.spesialisasi = spesialisasi;
    }

    // Getter dan Setter untuk spesialisasi
    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    // Overriding method displayInfo()
    @Override
    public String displayInfo() {
        return super.displayInfo() + 
               "\nSpesialisasi   : " + spesialisasi;
    }
}