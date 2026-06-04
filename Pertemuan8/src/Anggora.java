//Nama File : Anggora.java
//Deskripi  : berisi method dan atribut class anggora
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public class Anggora extends Kucing {

    //konst dgn parameter
    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    //method lain
    @Override
    public void bunyi() {
        System.out.println(getNama() + ": meong anggora");
    }
}