public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + ": melata");
    }

    @Override
    public void bunyi() {
        System.out.println(getNama() + ": guk-guk");
    }
}