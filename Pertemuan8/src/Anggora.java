// Marco
// 24060124130112

public class Anggora extends Kucing {

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bunyi() {
        System.out.println(getNama() + ": meong anggora");
    }
}