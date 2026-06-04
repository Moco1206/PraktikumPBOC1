/*  Nama file   : Lingkaran.java
    Deskripsi   : berisi atribut dan metode class Lingkaran
    Pembuat     : Marco Falias Pangkado
    Tanggal     : 16/03/2026
 */

public class Lingkaran extends BangunDatar implements IResize {
    //atribut
    private double jari;

    //konst dgn parameter
    public Lingkaran() {
        setJmlSisi(1);
    }

    //konst tnpa parameter
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

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100;
    }
}