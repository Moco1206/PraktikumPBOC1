//Nama File : Piaraan.java
//Deskripi  : berisi method dan atribut class Piaraan
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)
import java.util.*;

public class Piaraan {

    //atribut
    private int nbelm;
    private Queue<Anabul> Lanabul;

    //konst tnpa parameter
    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    //getter
    public int getNbelm() {
        return nbelm;
    }

    //method lain
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul a = Lanabul.poll();
        if (a != null) {
            nbelm--;
        }
        return a;
    }

    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double total = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama() + " - " + a.getClass().getName());
        }
    }
}