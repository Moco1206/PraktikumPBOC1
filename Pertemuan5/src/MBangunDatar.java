/*  Nama file   : MBangunDatar.java
    Deskripsi   : driver pertemuan 5
    Pembuat     : Marco Falias Pangkado
    Tanggal     : 28/03/2026
 */

public class MBangunDatar {
    public static void main(String[] args) {

        BangunDatar P1 = new Persegi(10, "MERAH", "HITAM");
        Persegi P2 = new Persegi(5, "BIRU", "HITAM");
        BangunDatar L1 = new Lingkaran(7, "Kuning", "Hitam");
        Lingkaran L2 = new Lingkaran(14, "PUTIH", "HITAM");

        System.out.println("=== inpo yang udah dibuat ===");
        P1.printInfo();
        System.out.println("Luas P1 = " + P1.getLuas());
        System.out.println("Keliling P1 = " + P1.getKeliling());
        System.out.println();

        P2.printInfo();
        System.out.println("Luas P2 = " + P2.getLuas());
        System.out.println("Keliling P2 = " + P2.getKeliling());
        System.out.println();

        L1.printInfo();
        System.out.println("Luas L1 = " + L1.getLuas());
        System.out.println("Keliling L1 = " + L1.getKeliling());
        System.out.println();

        L2.printInfo();
        System.out.println("Luas L2 = " + L2.getLuas());
        System.out.println("Keliling L2 = " + L2.getKeliling());
        System.out.println();

        System.out.println("bandingin luas keliling");
        System.out.println("P1 luasnya sama dengan P2? " + P1.isEqualLuas(P2));
        System.out.println("P1 kelilingnya sama dengan P2? " + P1.isEqualKeliling(P2));

        System.out.println("P1 luasnya sama dengan L1? " + P1.isEqualLuas(L1));
        System.out.println("P1 kelilingnya sama dengan L1? " + P1.isEqualKeliling(L1));

        System.out.println("L1 luasnya sama dengan L2? " + L1.isEqualLuas(L2));
        System.out.println("L1 kelilingnya sama dengan L2? " + L1.isEqualKeliling(L2));
    }
}