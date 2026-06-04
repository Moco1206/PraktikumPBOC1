//Nama File : Kucing.java
//Deskripi  : berisi method dan atribut class Kucing
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public class Kucing extends Anabul {

    //konst dgn parameter
    public Kucing(String nama) {
        super(nama);
    }

    //method lain
    @Override
    public void gerak() {
        System.out.println(getNama() + ": melata");
    }

    @Override
    public void bunyi() {
        System.out.println(getNama() + ": meong");
    }
}