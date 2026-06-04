//Nama File : MainSeminar.java
//Deskripi  : driver Seminar
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public class MainSeminar {
    public static void main(String[] args) {

        Seminar seminar = new Seminar();

        Dosen d1 = new Dosen("Pak Joko", "D001");
        Dosen d2 = new Dosen("Pak FuFu", "D002");

        MahasiswaSeminar m1 = new MahasiswaSeminar("Moco", "M001");
        MahasiswaSeminar m2 = new MahasiswaSeminar("Bahlul", "M002");
        MahasiswaSeminar m3 = new MahasiswaSeminar("Mega", "M003");
        MahasiswaSeminar m4 = new MahasiswaSeminar("Dudung", "M004");
        MahasiswaSeminar m5 = new MahasiswaSeminar("SiapaAku", "M005");

        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);
        System.out.println("Jumlah peserta: " + seminar.countPeserta());
        seminar.tampilPeserta();
        System.out.println("-----------------------------------------------------------");
        System.out.println("Jumlah mahasiswa: " + seminar.countMahasiswa());
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}