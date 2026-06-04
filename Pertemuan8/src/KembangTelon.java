//Nama File : KembangTelon.java
//Deskripi  : berisi method dan atribut class KembangTelon
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public class KembangTelon extends Kucing {

    //konst dgn parameter
    public KembangTelon(String nama, double bobot) {
        super(nama, bobot);
    }

    //method lain
    @Override
    public void bunyi() {
        System.out.println(getNama() + ": meong telon");
    }
}