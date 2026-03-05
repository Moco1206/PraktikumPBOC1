/* Nama File    : MMataKuliah.java
 * Deskripsi    : driver MataKuliah
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 05/03/2026
 * Lab          : C2
 */

public class MMataKuliah {
    public static void main(String[] args) {

        MataKuliah MK1 = new MataKuliah();
        MK1.setIdMatKul("IF101");
        MK1.setNama("Pemrograman Berorientasi Objek");
        MK1.setSks(3);

        System.out.println("ID Matkul : " + MK1.getIdMatKul());
        System.out.println("Nama      : " + MK1.getNama());
        System.out.println("SKS       : " + MK1.getSks());
        System.out.println();
        MataKuliah MK2 = new MataKuliah("IF102", "Struktur Data", 3);
        System.out.println("ID Matkul : " + MK2.getIdMatKul());
        System.out.println("Nama      : " + MK2.getNama());
        System.out.println("SKS       : " + MK2.getSks());

    }
}