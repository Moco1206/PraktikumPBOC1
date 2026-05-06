public class OperatorGenerik {
    public static <T> void tukar(DatumTuker<T> a, DatumTuker<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
    public static <T extends Kucing>
    double bobot2(T k1, T k2) {
        return k1.getBobot()
             + k2.getBobot();
    }
}