// Marco
// 24060124130112

public class Kucing extends Anabul {
    private double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }
    public double getBobot() {
        return bobot;
    }
    public void setBobot(double bobot) {
        this.bobot = bobot;
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