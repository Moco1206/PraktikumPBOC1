/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class kendaraan
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 09/03/2026
 * Lab          : C2
 */


public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan(){

        this.noPlat = "";
        this.jenis = "";
    }

    // knstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /**************** SELEKTOR ****************/
    // mengembalikan nomor plat kendaraan
    public String getNoPlat() {
        return noPlat;
    }

    // mengembalikan jenis kendaraan
    public String getJenis() {
        return jenis;
    }

    /**************** MUTATOR ****************/
    // Mengubah nomor plat kendaraan
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // Mengubah jenis kendaraan
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

}
