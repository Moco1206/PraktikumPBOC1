//Nama File : mainMahasiswa.java
//Deskripi  : driver Mahasiswa
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public class mainMahasiswa {
    public static void main(String[] args) {

        // c. default
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Konstruktor Default");
        m1.tampil();

        // d.3 parameter
        Mahasiswa m2 = new Mahasiswa("123", "wowo", "Informatika");
        System.out.println("Konstruktor 3 Parameter");
        m2.tampil();

        // e. copy
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("Konstruktor Copy");
        m3.tampil();
        System.out.println("-------------------------------");
        System.out.println("Overloading Method");
        m1.setProgramStudi();
        m1.tampil();
        System.out.println("-------------------------------");
        m2.setProgramStudi("matematka");
        m2.tampil();
        System.out.println("-------------------------------");
        m3.setProgramStudi(m2);
        m3.tampil();
    }
}