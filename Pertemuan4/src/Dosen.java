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
    public Dosen(){
        
    }
    public Dosen(String NIP, String nama, LocalDate Tanggal_lahir, LocalDate TMT, double gaji_pokok, String fakultas) {
        super(NIP, nama, Tanggal_lahir, TMT, gaji_pokok);
        this.fakultas = fakultas;
    }

    public String getFakultas(){
        return fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    public abstract void printInfo();
}