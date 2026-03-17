/*  Nama file   : Main.java
    Deskripsi   : driver buat tes semua method class Persegi dan Lingkaran
    Pembuat     : Marco Falias Pangkado
    Tanggal     : 16/03/2026
 */

public class Main {
    public static void main(String[] args) {
        Persegi P1, P2;
        Lingkaran L1, L2;

        P1 = new Persegi();
        P2 = new Persegi(5, "BIRU", "HITAM");
        System.out.println("Sisi     : " + P1.getSisi());
        System.out.println("Luas     : " + P1.getLuas());
        System.out.println("Keliling : " + P1.getKeliling());
        System.out.println("Diagonal : " + P1.getDiagonal());
        P1.setSisi(3);
        System.out.println("Sisi     : " + P1.getSisi());
        System.out.println("Luas     : " + P1.getLuas());
        System.out.println("Keliling : " + P1.getKeliling());
        System.out.println("Diagonal : " + P1.getDiagonal());
        System.out.println("Sisi     : " + P2.getSisi());
        System.out.println("Luas     : " + P2.getLuas());
        System.out.println("Keliling : " + P2.getKeliling());
        System.out.println("Diagonal : " + P2.getDiagonal());
        System.out.println("Warna P1    : "+ P1.getWarna());
        System.out.println("Warna P2    : "+ P2.getWarna());
        P1.setWarna("KUNING");
        P1.setBorder("PUTIH");
        System.out.println("Warna P1    : " + P1.getWarna());
        System.out.println("Border P1   : " + P1.getBorder());
        System.out.println("Border P2   : "+ P2.getBorder());
        System.out.println("-----------------------------------------");
        P1.printInfo();
        P2.printInfo();
        System.out.println("-----------------------------------------");
        L1 = new Lingkaran();
        L2 = new Lingkaran(6, "HIJAU", "HITAM");
        L1.setJari(7);
        L1.setWarna("Cklat");
        L1.setBorder("putih");
        System.out.println("Jari-jari L1    : "+ L1.getJari());
        System.out.println("Luas L1         : " + L1.getLuas());
        System.out.println("Keliling L1     : "+ L1.getKeliling());
        System.out.println("Jari-jari L2    : "+ L2.getJari());
        System.out.println("Luas L2         : " + L2.getLuas());
        System.out.println("Keliling L2     : " + L2.getKeliling());
        System.out.println("---------------------------------------------");
        L1.printInfo();
        L2.printInfo();
        BangunDatar.printCounterBangunDatar();
    }
}