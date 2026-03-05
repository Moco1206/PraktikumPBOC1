/* Nama File    : MDosen.java
 * Deskripsi    : Driver Dosen
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 05/03/2026
 */

public class MDosen {
    public static void main(String[] args) {

        Dosen D1 = new Dosen();
        D1.setNip("1987654321");
        D1.setNama("Dr. Budi");
        D1.setProdi("Informatika");

        System.out.println("NIP   : " + D1.getNip());
        System.out.println("Nama  : " + D1.getNama());
        System.out.println("Prodi : " + D1.getProdi());

        System.out.println();

        Dosen D2 = new Dosen("19781234", "Dr. Sari", "Sistem Informasi");

        System.out.println("NIP   : " + D2.getNip());
        System.out.println("Nama  : " + D2.getNama());
        System.out.println("Prodi : " + D2.getProdi());

    }
}