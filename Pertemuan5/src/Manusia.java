/*  Nama file   : Manusia.java
    Deskripsi   : kelas abstrak manusia
    Pembuat     : Marco Falias Pangkado (24060124130112)
    Tanggal     : 28/03/2026
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    //atribut
    protected String nama;
    protected String tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    //konst dgn parameter
    public Manusia(String nama, String tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    //konst dgn parameter (tanpa alamat)
    public Manusia(String nama, String tglMulaiKerja, double pendapatan) {
        this(nama, tglMulaiKerja, "-", pendapatan);
    }

    //getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    public void setTglMulaiKerja(String tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    //method lain
    protected int hitungSelisihTahun() {       
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-uuuu");  //karna inpputnya string aku jadi bingung, jadi minta tolong sahabat
        LocalDate mulai = LocalDate.parse(tglMulaiKerja, fmt);
        LocalDate now = LocalDate.now();
        return Period.between(mulai, now).getYears();
    }

    public void cetakInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Tgl Mulai Kerja : " + tglMulaiKerja);
        System.out.println("Alamat : " + alamat);
        System.out.println("Pendapatan : " + pendapatan);
    }

    public abstract int hitungMasaKerja();
}