public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + ": terbang");
    }

    @Override
    public void bunyi() {
        System.out.println(getNama() + ": cuit");
    }
}