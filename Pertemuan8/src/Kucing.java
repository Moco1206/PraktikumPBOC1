//Nama File : Kucing.java
//Deskripi  : berisi method dan atribut class kucing
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)
public class Kucing extends Anabul {
    //atribut
    private double bobot;

    //konst dgn parameter
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }
    //getter dan setter
    public double getBobot() {
        return bobot;
    }
    public void setBobot(double bobot) {
        this.bobot = bobot;
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