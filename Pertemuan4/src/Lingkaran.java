/*  Nama file   : Lingkaran.java
    Deskripsi   : berisi atribut dan metode class Lingkaran
    Pembuat     : Marco Falias Pangkado
    Tanggal     : 16/03/2026
 */

public class Lingkaran extends BangunDatar {
    //atribut
    private double jari;

    //method
    //konst tnpa parameter
    public Lingkaran() {
        setJmlSisi(1);
    }

    //konst dgn parameter
    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border); 
        this.jari = diameter / 2;
    }

    //getter dan setter
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return 3.14 * jari * jari;
    }

    public double getKeliling() {
        return 2 * 3.14 * jari;
    }

    //method lain
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}