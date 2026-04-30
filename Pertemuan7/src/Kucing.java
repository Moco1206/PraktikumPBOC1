public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + ": melata");
    }

    @Override
    public void bunyi() {
        System.out.println(getNama() + ": meong");
    }
}