public class Mahasiswa {

    private String NIM;
    private String Nama;
    private String ProgramStudi;

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }
    public String getProgramStudi() {
        return ProgramStudi;
    }
    
    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    public void setProgramStudi(String prodi) {
        this.ProgramStudi = prodi;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.ProgramStudi = m.getProgramStudi();
    }


    // c. default
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    // d. 3 parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.NIM = nim;
        this.Nama = nama;
        this.ProgramStudi = prodi;
    }

    // e. bunshin
    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.getNIM();
        this.Nama = m.getNama();
        this.ProgramStudi = m.getProgramStudi();
    }

    public void tampil() {
        System.out.println("NIM     : " + NIM);
        System.out.println("Nama    : " + Nama);
        System.out.println("Prodi   : " + ProgramStudi);
    }
}