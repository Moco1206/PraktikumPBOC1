//Nama File : Data.java
//Deskripi  : berisi method dan atribut class data
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public class Data<T> {
    //atribut
    private T[] ruang;
    private int banyak;

    //konst tnpa parameter
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }
    //getter dan setter
    public void setIsi(int posisi, T isi) {
        ruang[posisi] = isi;
        banyak++;
    }
    public T getIsi(int posisi) {
        return ruang[posisi];
    }
    public int getSize() {
        return banyak;
    }
}