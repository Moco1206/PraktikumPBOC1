/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 09/03/2026
 * Lab          : C2
 */git add Pertemuan3/src/Dosen.java

public class Dosen {

    private String nip;
    private String nama;
    private String prodi;

    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

}