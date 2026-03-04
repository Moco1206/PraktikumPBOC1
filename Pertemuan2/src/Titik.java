/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 26/2/2026
 */

public class Titik {
    /**************** ATRIBUT    ****************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /**************** METHOD    ****************/
    //konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y; 
    }

    //mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //bikin titik baru dengan input x dan y
    public Titik (double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    public static int getCounterTitik(){
        return counterTitik;
    }   
    
    void printCounterTitik() {
        System.out.println(this.counterTitik);
    }

    public int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        } 
        else if (this.absis < 0 && this.ordinat > 0) {
            return 2;
        } 
        else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        } 
        else if (this.absis > 0 && this.ordinat < 0) {
            return 4;
        } 
        else {
            return 0;
        }
    }

    public double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }   

    public double getJarak(Titik T){
        double dx, dy;
        dx = this.absis - T.absis;
        dy = this.ordinat - T.ordinat;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }
    public void refleksiY() {
        this.absis = -this.absis;
    }
    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }
    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

} //end class titik
