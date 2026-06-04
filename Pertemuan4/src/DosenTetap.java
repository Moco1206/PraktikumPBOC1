/*  Nama file   : DosenTetap.java
    Deskripsi   : berisi atrbit dan method dosen tetap
    Pembuat     : Marco Falias Pangkado
    Tanggal     : 18/03/2026
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {

    //atribt
    private String NIDN;
    private final int BUP = 65;

    //method
    //konst tnpa parameter
    public DosenTetap(){
        
    }

    //konst dgn parameter
    public DosenTetap(String NIP, String NIDN, String nama, LocalDate Tanggal_lahir, LocalDate TMT, double gaji_pokok, String fakultas) {
        super(NIP, nama, Tanggal_lahir, TMT, gaji_pokok, fakultas);
        this.NIDN = NIDN;
    }

    //getter dan setter
    public String getNIDN(){
        return NIDN;
    }
    public int getBUP(){
        return BUP;
    }
    public double getTunjangan(){
        return 0.02 * getMasaKerja().getYears() * getGajiPokok();
    }

    public LocalDate getPensi(){
        return getTanggal_lahir().plusYears(65).withDayOfMonth(1).plusMonths(1);
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    //method lain
    @Override
    public void printInfo() {
        Period masa_kerja = getMasaKerja();
        System.out.println("NIP : " + getNIP());
        System.out.println("NIDN : " + NIDN);
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggal_lahir());
        System.out.println("TMT : " + getTMT());
        System.out.println("Jabatan : dosen tetap");
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Masa Kerja : " + masa_kerja.getYears() + " tahun " + masa_kerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + getPensi());
        System.out.println("Gaji Pokok : " + getGajiPokok());
        System.out.println("Tunjangan : " + getTunjangan());
    }
}