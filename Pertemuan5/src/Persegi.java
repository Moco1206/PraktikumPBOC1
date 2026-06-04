/*  Nama file   : Persegi.java
    Deskripsi   : berisi atribut dan metode class Persegi
    Pembuat     : Marco Falias Pangkado
    Tanggal     : 16/03/2026
 */

public class Persegi extends BangunDatar implements IResize {

    //atribut
    private double sisi;

    //konst tnpa parameter
    public Persegi() {
        setJmlSisi(4);
    }

    //konst dgn parameter
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border); 
        this.sisi = sisi;
    }

    //getter dan setter
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    //method lain
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }
    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }
    
}