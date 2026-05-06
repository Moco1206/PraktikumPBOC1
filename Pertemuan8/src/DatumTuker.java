public class DatumTuker<T> {
    private T isi;

    public DatumTuker(T isi) {
        this.isi = isi;
    }
    public T getIsi() {
        return isi;
    }
    public void setIsi(T isi) {
        this.isi = isi;
    }
}