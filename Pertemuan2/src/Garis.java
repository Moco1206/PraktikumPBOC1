/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 04/3/2026
 */

public class Garis {

    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;
    
    //Membuat objek Garis dengan nilai default.
    public Garis() {
        this.titikAwal = new Titik(0,0);
        this.titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    //Membuat objek Garis dengan titik awal dan akhir yang ditentukan user.
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }
    
    //mengembalikasn nilai titik aawal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    //mengembalikan nilai titik akhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    //mengubah nilai titik awal garis
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    //mengubah nilai titik akhir garis
    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    //mengembalikan nilai counter garis (jumlah garis yang dibuat)
    public static int getCounterGaris() {
        return counterGaris;
    }

    //mengembalikan nilai panjang
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    //menghitung kemiringan garis
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx;
    }

    //mengmbalikan titik tengah garis
    public Titik getTitikTengah() {
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }

    //mengecek apakah dua garis sejajar
    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    //mengecek apakah dua garis tegak lurus
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // menampilkan informasi garis ke layar
    public void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    //menghasilkan persamaan garis
    public String getPersamaan() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}
