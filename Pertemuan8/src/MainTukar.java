//Nama File : MainTukar.java
//Deskripi  : driver DatumTuker
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)


public class MainTukar {
    public static void main(String[] args) {
        DatumTuker<Integer> a = new DatumTuker<>(3);
        DatumTuker<Integer> b = new DatumTuker<>(6);
        System.out.println("int");
        System.out.println("Sebelum:");
        System.out.println("a = " + a.getIsi());
        System.out.println("b = " + b.getIsi());
        OperatorGenerik.tukar(a, b);
        System.out.println("Sesudah:");
        System.out.println("a = " + a.getIsi());
        System.out.println("b = " + b.getIsi());
        System.out.println();

        //string
        DatumTuker<String> s1 = new DatumTuker<>("Halo");
        DatumTuker<String> s2 = new DatumTuker<>("Dunia");
        System.out.println("strng");
        System.out.println("Sebelum:");
        System.out.println("s1 = " + s1.getIsi());
        System.out.println("s2 = " + s2.getIsi());
        OperatorGenerik.tukar(s1, s2);
        System.out.println("Sesudah:");
        System.out.println("s1 = " + s1.getIsi());
        System.out.println("s2 = " + s2.getIsi());
        System.out.println();

        //anbaul
        DatumTuker<Anabul> hewan1 =new DatumTuker<>(new Anjing("Guguk"));
        DatumTuker<Anabul> hewan2 =new DatumTuker<>(new Kucing("mengmeng", 3));
        System.out.println("--------anabul------------");
        System.out.println("Sebelum:");
        hewan1.getIsi().bunyi();
        hewan2.getIsi().bunyi();
        OperatorGenerik.tukar(hewan1,hewan2);
        System.out.println("Sesudah:");
        hewan1.getIsi().bunyi();
        hewan2.getIsi().bunyi();
        System.out.println();

        //bobot2
        System.out.println("---------bobot kucing ----------------");
        Anggora ang =new Anggora("kemeng", 3.5);
        KembangTelon kem =new KembangTelon("teddy", 4.0);
        double total = OperatorGenerik.bobot2(ang, kem);
        System.out.println("Total bobot = "+ total);
    }
}