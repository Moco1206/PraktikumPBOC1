/* Nama File    : MTitik.java
 * Deskripsi    : driver titik
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

        Titik T2 = T1;          
        T2.printTitik();        
        T1.setAbsis(10);        
        T1.setOrdinat(10);      
        T2.printTitik();        

        Titik T3 = new Titik(7,7);
        T3.printTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2 .getCounterTitik());

        T2.printCounterTitik();
        System.out.println("Titik T2 ada di kuadran : " + T2.getKuadran());
        System.out.println("Jarak T2 ke pusat : " + T2.getJarakPusat());
        System.out.println("jarak T2 dengan T3 : " + T2.getJarak(T3));
        T1.refleksiX();  
        T1.printTitik();
        Titik T4 = new Titik(3,4);
        Titik T5 = T4.getRefleksiX();
        T4.printTitik();
        T5.printTitik();


    }
}