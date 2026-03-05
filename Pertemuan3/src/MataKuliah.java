/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 05/03/2026
 */

public class MataKuliah {

    /*************** ATRIBUT ***************/
    private String idMatKul;
    private String nama;
    private int sks;

    /*************** METHOD ***************/

    // Konstruktor tanpa parameter
    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    // Konstruktor dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Getter idMatKul
    public String getIdMatKul() {
        return idMatKul;
    }

    // Setter idMatKul
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter sks
    public int getSks() {
        return sks;
    }

    // Setter sks
    public void setSks(int sks) {
        this.sks = sks;
    }

}