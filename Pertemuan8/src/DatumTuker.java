//Nama File : DatumTuker.java
//Deskripi  : berisi method dan atribut class DatumTuker
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public class DatumTuker<T> {
    //atribut
    private T isi;

    //konst dgn parameter
    public DatumTuker(T isi) {
        this.isi = isi;
    }

    //getter dan setter
    public T getIsi() {
        return isi;
    }
    public void setIsi(T isi) {
        this.isi = isi;
    }
}