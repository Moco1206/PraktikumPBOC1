/* Nama File    : MGaris.java
 * Deskripsi    : driver clas Garis
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 04/03/2026
 */

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(-2,-2);
        Titik T2 = new Titik(4,4);
        Garis G1 = new Garis(T1, T2);
        G1.printGaris();
        Titik T3 = new Titik(2, 2);
        Titik T4 = new Titik(8, 8);
        G1.setTitikAwal(T3);
        G1.setTitikAkhir(T4);
        G1.printGaris();
        System.out.println("Panjang gris: " + G1.getPanjang());
        System.out.println("Gradien: " + G1.getGradien());
        Titik tengah = G1.getTitikTengah();
        System.out.print("Titik tengah: "); tengah.printTitik();
        System.out.println("Persamaan: " + G1.getPersamaan());
        System.out.println("Jumlah objek garis: " + Garis.getCounterGaris());
        Titik T5 = new Titik(0,0);
        Titik T6 = new Titik(6,6);
        Garis G2 = new Garis(T5, T6);
        if (G1.isSejajar(G2)) {
            System.out.println("G1 dan G2 sejajar");
        } 
        else {
            System.out.println("G1 dan G2 tidak sejajar");
        }
        if (G1.isTegakLurus(G2)) {
            System.out.println("G1 dan G3 tegak lurus");
        } 
        else {
            System.out.println("G1 dan G3 tidak tegak lurus");
        }
    }
}