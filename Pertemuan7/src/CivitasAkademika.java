//Nama File : CivitasAkademika.java
//Deskripi  : berisi method dan atribut class CivitasAkademika
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public abstract class CivitasAkademika{
    //atribut
    protected String nama;

    //konst dgn parameter
    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    //getter
    public String getNama() {
        return nama;
    }
    public abstract String getNomor();
}