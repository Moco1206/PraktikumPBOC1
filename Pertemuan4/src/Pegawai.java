/*  Nama file   : BangunDatar.java
    Deskripsi   : berisi atribut dan metode class bangun datar
    Pembuat     : Marco Falias Pangkado
    Tanggal     : 18/03/2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    //atribut
    private String NIP;
    private String nama;
    private LocalDate Tanggal_lahir;
    private LocalDate TMT;
    private double gaji_pokok;

    /* METHODD */
    //konstruktor
    public Pegawai(){

    }
    public Pegawai(String NIP, String nama, LocalDate Tanggal_lahir, LocalDate TMT, double gaji_pokok){
        this.NIP = NIP;
        this.nama = nama;
        this.Tanggal_lahir = Tanggal_lahir;
        this.TMT = TMT;
        this.gaji_pokok = gaji_pokok;
    }

    //getter
    public String getNIP (){
        return NIP;
    }
    public String getNama() {
        return nama;
    }
    public LocalDate getTanggal_lahir(){
        return Tanggal_lahir;
    }
    public LocalDate getTMT(){
        return TMT;
    }
    public double getGajiPokok(){
        return gaji_pokok;
    }
    public Period getMasaKerja(){ //kata sahabat gpt pakai period aja lebih enak
        return Period.between(TMT, LocalDate.now());
    }

    //setter
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setTgl_lahir(LocalDate Tanggal_lahir) {
        this.Tanggal_lahir = Tanggal_lahir;
    }
    public void setTMT(LocalDate TMT) {
        this.TMT = TMT;
    }
    public void setGajiPokok(double gaji_pokok){
        this.gaji_pokok = gaji_pokok;
    }

    //method lain
    public void printInfo() {
        System.out.println("NIP            : " + NIP);
        System.out.println("Nama           : " + nama);
    }
    
}
