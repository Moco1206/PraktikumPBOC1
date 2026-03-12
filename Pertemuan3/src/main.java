/* Nama File    : Main.java
 * Deskripsi    : program utama untuk menguji class Dosen, MataKuliah, Kendaraan, dan Mahasiswa
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 09/03/2026
 */

public class Main {

    public static void main(String[] args) {

        
        Dosen dosen1 = new Dosen("1234568", "joko solo", "Informatika");
        Kendaraan kendaraan1 = new Kendaraan("H1234AB", "Motor");
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Berorientasi Objek", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah("IF103", "Basis Data", 3);

        Mahasiswa mhs1 = new Mahasiswa("24060124130112", "Marco Falias Pangkado", "Informatika");
        mhs1.setDosenWali(dosen1);
        mhs1.setKendaraan(kendaraan1);
        mhs1.addMatKul(mk1);
        mhs1.addMatKul(mk2);
        mhs1.addMatKul(mk3);

        System.out.println("=== DATA MAHASISWA ===");
        mhs1.printMhs();

        System.out.println("\nJumlah Mata Kuliah : " + mhs1.getJumlahMatKul());

        System.out.println("Total SKS          : " + mhs1.getJumlahSKS());

        mhs1.printDetailMhs();

    }
}