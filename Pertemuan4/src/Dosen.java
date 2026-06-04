/*  Nama file   : Dosen.java
    Deskripsi   : berisi atrbit dan method dosen 
    Pembuat     : Marco Falias Pangkado
    Tanggal     : 18/03/2026
 */

import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    //atribut
    private String fakultas;

    //method

    //konstruktor tnpa parameter
    public Dosen(){
        
    }

    //konstruktor parameter
    public Dosen(String NIP, String nama, LocalDate Tanggal_lahir, LocalDate TMT, double gaji_pokok, String fakultas) {
        super(NIP, nama, Tanggal_lahir, TMT, gaji_pokok);
        this.fakultas = fakultas;
    }

    //getter fakultas
    public String getFakultas(){
        return fakultas;
    }

    //setter fakultas
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    //method lain
    public abstract void printInfo();
}