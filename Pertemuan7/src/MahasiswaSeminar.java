public class MahasiswaSeminar extends CivitasAkademika {

    private String NIM;
    private Dosen dosenWali;

    public MahasiswaSeminar(String nama, String NIM) {
        super(nama);
        this.NIM = NIM;
    }
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

    public void tampilDataMahasiswa() {
        System.out.println("NIM   : " + NIM);
        System.out.println("Nama  : " + getNama());
        System.out.println("Dosen Wali : " + (dosenWali != null ? dosenWali.getNama() : "-"));
        System.out.println();
    }
}