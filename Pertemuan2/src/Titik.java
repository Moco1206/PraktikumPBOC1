/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 26/2/2026
 */

public class Titik {
    /**************** ATRIBUT    ****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /**************** METHOD    ****************/
    //konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y; 
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //bikin titik baru dengan input x dan y
    Titik (double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    static int getCounterTitik(){
        return counterTitik;
    }   
    
    void printCounterTitik() {
    System.out.println(this.counterTitik);
    }

    int getKuadran() {
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

    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }   

    double getJarak(Titik T){
        double dx, dy;
        dx = this.absis - T.absis;
        dy = this.ordinat - T.ordinat;
        return Math.sqrt(dx*dx + dy*dy);
    }

    void refleksiX() {
        this.ordinat = -this.ordinat;
    }
    void refleksiY() {
        this.absis = -this.absis;
    }
    Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }
    Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

} //end class titik
