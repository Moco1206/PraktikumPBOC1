/*  Nama file   : mainPegawai.java
    Deskripsi   : driver program untuk menguji class Pegawai
    Pembuat     : Marco Falias Pangkado
    Tanggal     : 18/03/2026
 */

import java.time.LocalDate;

public class mainPegawai {
    public static void main(String[] args) {
        DosenTetap dt1 = new DosenTetap("9545647548", "78647324", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "FSM");
        dt1.printInfo();
        System.out.println("----------------------------------------------");
        DosenTetap dt2 = new DosenTetap("123456789", "123456", "marco", LocalDate.of(2006, 2, 1), LocalDate.of(2020, 1, 1), 9000000, "FSM");
        dt2.printInfo();
        System.out.println("----------------------------------------------");
        DosenTamu dtam1 = new DosenTamu("987654321", "654321", "Bowo", LocalDate.of(1985, 8, 20), LocalDate.of(2020, 2, 1), 4500000, "FF", LocalDate.of(2027, 2, 1));
        dtam1.printInfo();
        System.out.println("---------------------------------------------------");
        Tendik t1 = new Tendik( "012345689", "Sawit", LocalDate.of(1990, 3, 10), LocalDate.of(2018, 6, 1), 4000000, "Akademik");
        t1.printInfo();
        System.out.println("-----------------------------------------------------");
    }
}