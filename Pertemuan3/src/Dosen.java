/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 09/03/2026
 * Lab          : C2
 */

public class Dosen {

    /************* ATRIBUT *************/
    private String nip;
    private String nama;
    private String prodi;


    /************* KONSTRUKTOR *************/
    // konstruktor tanpa parameter
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // konstruktor dengan parameter 
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }


    /************* SELEKTOR (GETTER) *************/
    // mengambil nilai NIP dosen
    public String getNip() {
        return nip;
    }

    // mengambil nilai nama dosen
    public String getNama() {
        return nama;
    }

    // mengambil nilai program studi dosen
    public String getProdi() {
        return prodi;
    }


    /************* MUTATOR (SETTER) *************/
    // mengubah nilai NIP dosen
    public void setNip(String nip) {
        this.nip = nip;
    }

    // mengubah nilai nama dosen
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mengubah nilai program studi dosen
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

}