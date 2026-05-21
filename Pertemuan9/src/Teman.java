import java.util.*;

public class Teman {
    private int nbelm;
    private ArrayList<String> Lnama;

    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        int indeks = Lnama.indexOf(nama);
        if (indeks != -1) {
            setNama(indeks, namabaru);
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        for (String n : Lnama) {
            System.out.println(n);
        }
    }
}