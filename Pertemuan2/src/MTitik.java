/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 26/2/2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3);         //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);       //mengubah ordinat T1 dengan nilai 4
        T1.printTitik();        //mencetak koordinat T1 ke layar
        T1.geser(3,4);          //menggeser T1 sejauh (3,4)
        T1.printTitik();        //menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;          // Membuat referensi T2 yang menunjuk ke objek yang sama dengan T1
        T2.printTitik();        // Mencetak koordinat T2
        T1.setAbsis(10);        // Mengubah absis T1 menjadi 10
        T1.setOrdinat(10);      // Mengubah ordinat T1 menjadi 10
        T2.printTitik();        // Mencetak kembali T2 untuk melihat efek perubahan pada T1

        Titik T3 = new Titik(7,7);
        T3.printTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());

        T2.printCounterTitik();


    }
}