/*  Nama file   : Tenidk.java
    Deskripsi   : berisi atrbit dan method tendik
    Pembuat     : Marco Falias Pangkado
    Tanggal     : 18/03/2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {

    //atribut
    private String bidang;
    private final int BUP = 55;

    //method
    //konstruktor
    public Tendik(){

    }
    public Tendik(String NIP, String nama, LocalDate Tanggal_lahir, LocalDate TMT, double gaji_pokok, String bidang) {
        super(NIP, nama, Tanggal_lahir, TMT, gaji_pokok);
        this.bidang = bidang;
    }

    //getter
    public String getBidang(){
        return bidang;
    }
    public int getBUP(){
        return BUP;
    }
    public double getTunjangan(){
        return 0.01 * getMasaKerja().getYears() * getGajiPokok();
    }
    public LocalDate getPensi(){
        return getTanggal_lahir().plusYears(65).withDayOfMonth(1).plusMonths(1);
    }

    //setter
    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    @Override
    public void printInfo() {
        Period mk = getMasaKerja();
        System.out.println("NIP : " + getNIP());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggal_lahir());
        System.out.println("TMT : " + getTMT());
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + getPensi());
        System.out.println("Gaji Pokok : " + getGajiPokok());
        System.out.println("Tunjangan : " + getTunjangan());
    }
}