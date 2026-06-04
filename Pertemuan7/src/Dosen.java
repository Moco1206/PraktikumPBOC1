//Nama File : Dosen.java
//Deskripi  : berisi method dan atribut class Dosen
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public class Dosen extends CivitasAkademika {

    //atribut
    private String NIP;

    //konst dgn parameter
    public Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    //getter
    public String getNIP() {
        return NIP;
    }

    @Override
    public String getNomor() {
        return NIP;
    }
}