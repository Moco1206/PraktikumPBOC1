//Nama File : Main.java
//Deskripi  : driver buat tes semua
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public class Main {
    public static void main(String[] args) {
        Teman teman = new Teman();

        teman.addNama("sawit");
        teman.addNama("wowo");
        teman.addNama("nadim");
        teman.addNama("wowo");

        System.out.println("Daftar teman:");
        teman.showTeman();

        System.out.println("Jumlah elemen: " + teman.getNbelm());
        System.out.println("Nama indeks 1: " + teman.getNama(1));

        teman.setNama(0, "vidi");
        System.out.println("Setelah setNama:");
        teman.showTeman();

        System.out.println("Apakah wowo member? " + teman.isMember("wowo"));
        System.out.println("Jumlah nama wowo: " + teman.countNama("wowo"));

        teman.gantiNama("Citra", "Dina");
        System.out.println("Setelah gantiNama:");
        teman.showTeman();

        teman.delNama("wowo");
        System.out.println("Setelah delNama wowo:");
        teman.showTeman();

        System.out.println();

        Piaraan piaraan = new Piaraan();

        Anabul k1 = new Kucing("Michael", 4.5);
        Anabul k2 = new Anggora("Luna", 3.8);
        Anabul k3 = new KembangTelon("Oyen", 5.2);
        Anabul a1 = new Anjing("Bruno");
        Anabul b1 = new Burung("Manuk");

        piaraan.enqueueAnabul(k1);
        piaraan.enqueueAnabul(k2);
        piaraan.enqueueAnabul(k3);
        piaraan.enqueueAnabul(a1);
        piaraan.enqueueAnabul(b1);

        System.out.println("Daftar anabul:");
        piaraan.showAnabul();

        System.out.println("Jumlah anabul: " + piaraan.getNbelm());
        System.out.println("Anabul pertama: " + piaraan.getAnabul().getNama());
        System.out.println("Apakah Luna member? " + piaraan.isMember(k2));

        System.out.println("Jumlah keluarga kucing: " + piaraan.countKucing());
        System.out.println("Total bobot keluarga kucing: " + piaraan.bobotKucing());

        System.out.println("Jenis anabul:");
        piaraan.showJenisAnabul();

        Anabul keluar = piaraan.dequeueAnabul();
        System.out.println("Anabul keluar antrean: " + keluar.getNama());

        System.out.println("Daftar anabul setelah dequeue:");
        piaraan.showAnabul();
    }
}