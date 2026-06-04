//Nama File : Anjing.java
//Deskripi  : berisi method dan atribut class anjink
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public class Anjing extends Anabul {

    //konst dgn parameter
    public Anjing(String nama) {
        super(nama);
    }

    //method lain
    @Override
    public void gerak() {
        System.out.println(getNama() + ": melata");
    }

    @Override
    public void bunyi() {
        System.out.println(getNama() + ": guk-guk");
    }
}