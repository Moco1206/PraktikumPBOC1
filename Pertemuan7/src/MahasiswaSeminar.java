//Nama File : MahasiswaSeminar.java
//Deskripi  : berisi method dan atribut class MahasiswaSeminar
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public class MahasiswaSeminar extends CivitasAkademika {
    //atribut
    private String NIM;
    private Dosen dosenWali;

    //konst dgn parameter
    public MahasiswaSeminar(String nama, String NIM) {
        super(nama);
        this.NIM = NIM;
    }

    //getter dan setter
    public String getNIM() {
        return NIM;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    @Override
    public String getNomor() {
        return NIM;
    }

    //method lain
    public void tampilDataMahasiswa() {
        System.out.println("NIM   : " + NIM);
        System.out.println("Nama  : " + getNama());
        System.out.println("Dosen Wali : " + (dosenWali != null ? dosenWali.getNama() : "-"));
        System.out.println();
    }
}