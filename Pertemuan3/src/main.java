/* Nama File    : Main.java
 * Deskripsi    : program utama untuk menguji class Dosen, MataKuliah, Kendaraan, dan Mahasiswa
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 09/03/2026
 */

public class Main {

    public static void main(String[] args) {

        /**************** MEMBUAT OBJEK DOSEN ****************/
        Dosen dosen1 = new Dosen("1987654321", "Dr. Budi Santoso", "Informatika");

        /**************** MEMBUAT OBJEK KENDARAAN ****************/
        Kendaraan kendaraan1 = new Kendaraan("H1234AB", "Motor");

        /**************** MEMBUAT OBJEK MATA KULIAH ****************/
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Berorientasi Objek", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah("IF103", "Basis Data", 3);

        /**************** MEMBUAT OBJEK MAHASISWA ****************/
        Mahasiswa mhs1 = new Mahasiswa("24060124130112", "Marco Falias Pangkado", "Informatika");

        /**************** MENGATUR DOSEN WALI DAN KENDARAAN ****************/
        mhs1.setDosenWali(dosen1);
        mhs1.setKendaraan(kendaraan1);

        /**************** MENAMBAHKAN MATA KULIAH ****************/
        mhs1.addMatKul(mk1);
        mhs1.addMatKul(mk2);
        mhs1.addMatKul(mk3);

        /**************** MENAMPILKAN DATA MAHASISWA ****************/
        System.out.println("=== DATA MAHASISWA ===");
        mhs1.printMhs();

        /**************** MENAMPILKAN JUMLAH MATA KULIAH ****************/
        System.out.println("\nJumlah Mata Kuliah : " + mhs1.getJumlahMatKul());

        /**************** MENAMPILKAN TOTAL SKS ****************/
        System.out.println("Total SKS          : " + mhs1.getJumlahSKS());

        /**************** MENAMPILKAN DETAIL MAHASISWA ****************/
        System.out.println("\n=== DETAIL MAHASISWA ===");
        mhs1.printDetailMhs();

    }
}