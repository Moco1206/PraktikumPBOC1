/*  Nama file   : DosenTamu.java
    Deskripsi   : berisi atrbit dan method dosen tamu
    Pembuat     : Marco Falias Pangkado
    Tanggal     : 18/03/2026
 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {

    //atribut
    private String NIDK;
    private LocalDate akhirKontrak;

    //methos
    public DosenTamu(){

    }
    public DosenTamu(String NIP, String NIDK, String nama, LocalDate Tanggal_lahir, LocalDate TMT, double gaji_pokok, String fakultas, LocalDate akhirKontrak) {
        super(NIP, nama, Tanggal_lahir, TMT, gaji_pokok, fakultas);
        this.NIDK = NIDK;
        this.akhirKontrak = akhirKontrak;
    }

    public String getNIDK(){
        return NIDK;
    }
    public LocalDate getAkhirKontrak(){
        return akhirKontrak;
    }
    public double getTunjangan(){
        return 0.025 * getGajiPokok();
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP : " + getNIP());
        System.out.println("NIDK : " + NIDK);
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggal_lahir());
        System.out.println("TMT : " + getTMT());
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Akhir Kontrak : " + akhirKontrak);
        System.out.println("Gaji Pokok : " + getGajiPokok());
        System.out.println("Tunjangan : " + getTunjangan());
    }
}