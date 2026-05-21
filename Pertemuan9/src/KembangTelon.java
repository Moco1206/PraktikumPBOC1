// Marco
// 24060124130112

public class KembangTelon extends Kucing {

    public KembangTelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bunyi() {
        System.out.println(getNama() + ": meong telon");
    }
}