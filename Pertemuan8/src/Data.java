// Marco
// 24060124130112

public class Data<T> {
    private T[] ruang;
    private int banyak;

    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }
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