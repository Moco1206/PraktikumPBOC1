/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 09/03/2026
 */

public class Mahasiswa {

    /**************** ATRIBUT ****************/
    private String nim;
    private String nama;
    private String prodi;
    private static MataKuliah[] listMatKul = new MataKuliah[50];
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /**************** KONSTRUKTOR ****************/
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    /**************** SELEKTOR ****************/
    // Mengambil NIM mahasiswa
    public String getNim() {
        return nim;
    }

    // Mengambil nama mahasiswa
    public String getNama() {
        return nama;
    }

    // Mengambil prodi mahasiswa
    public String getProdi() {
        return prodi;
    }

    // Mengambil data dosen wali
    public Dosen getDosenWali() {
        return dosenWali;
    }

    // Mengambil data kendaraan mahasiswa
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    /**************** MUTATOR ****************/
    // Mengubah NIM mahasiswa
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Mengubah nama mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengubah prodi mahasiswa
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Mengubah dosen wali mahasiswa
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // Mengubah kendaraan mahasiswa
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    /**************** METHOD LAIN ****************/
    // Menambahkan mata kuliah ke dalam listMatKul
    public void addMatKul(MataKuliah mk) {
        for (int i = 0; i < listMatKul.length; i++) {
            if (listMatKul[i] == null) {
                listMatKul[i] = mk;
                break;
            }
        }
    }

    // Menghitung total SKS dari mata kuliah yang diambil
    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < listMatKul.length; i++) {
            if (listMatKul[i] != null) {
                total += listMatKul[i].getSks();
            }
        }
        return total;
    }

    // Menghitung jumlah mata kuliah yang diambil
    public int getJumlahMatKul() {
        int jumlah = 0;
        for (int i = 0; i < listMatKul.length; i++) {
            if (listMatKul[i] != null) {
                jumlah++;
            }
        }
        return jumlah;
    }

    // Menampilkan data dasar mahasiswa
    public void printMhs() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Menampilkan detail lengkap mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);

        System.out.println("Dosen Wali : " + dosenWali.getNama());
        System.out.println("NIP Dosen  : " + dosenWali.getNip());

        System.out.println("Kendaraan  : " + kendaraan.getJenis());
        System.out.println("No Plat    : " + kendaraan.getNoPlat());

        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < listMatKul.length; i++) {
            if (listMatKul[i] != null) {
                System.out.println("- " + listMatKul[i].getNama() + " (" + listMatKul[i].getSks() + " SKS)");
            }
        }
    }

}