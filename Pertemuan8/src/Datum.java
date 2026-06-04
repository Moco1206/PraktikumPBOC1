//Nama File : Datum.java
//Deskripi  : berisi method dan atribut class Datum
//Pembuat   : Marco Falias Pangkado
//Tanggal   : (jujur ga ingat)

public class Datum<T> {
    //atribut
    private T isi;

    //konst dgn parameter
    public Datum(T isi) {
        this.isi = isi;
    }

    //getter dan setter
    public T getIsi() {
        return isi;
    }

    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}