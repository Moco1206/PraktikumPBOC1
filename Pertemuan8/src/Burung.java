//Nama File : Burung.java
//Deskripi  : berisi method dan atribut class burung
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public class Burung extends Anabul {

    //konst dgn parameter
    public Burung(String nama) {
        super(nama);
    }

    //method lain
    @Override
    public void gerak() {
        System.out.println(getNama() + ": terbang");
    }

    @Override
    public void bunyi() {
        System.out.println(getNama() + ": cuit");
    }
}