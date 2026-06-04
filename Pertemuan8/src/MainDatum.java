//Nama File : MainDatum.java
//Deskripi  : driver Datum
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public class MainDatum {
    public static void main(String[] args) {
        Kucing k = new Kucing("titid", 7.2);
        Anjing a = new Anjing("heli");
        Burung b = new Burung("beo");
        Datum<Kucing> datumKucing = new Datum<>(k);
        Datum<Anjing> datumAnjing = new Datum<>(a);
        Datum<Burung> datumBurung = new Datum<>(b);
        System.out.println("koceng");
        datumKucing.getIsi().gerak();
        datumKucing.getIsi().bunyi();
        System.out.println("Bobot: " + datumKucing.getIsi().getBobot());
        System.out.println();
        System.out.println("anyinh");
        datumAnjing.getIsi().gerak();
        datumAnjing.getIsi().bunyi();
        System.out.println();
        System.out.println("manuk");
        datumBurung.getIsi().gerak();
        datumBurung.getIsi().bunyi();
    }
}