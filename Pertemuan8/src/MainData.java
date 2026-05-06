// Marco
// 24060124130112

public class MainData {
    public static void main(String[] args) {
        Data<Anabul> data = new Data<>();
        data.setIsi(0, new Anjing("Asuk") );
        data.setIsi(1,new Burung("cicit"));
        data.setIsi(2, new Kucing("meng", 3));
        System.out.println("Jumlah data = "+ data.getSize());
        System.out.println("Data ke-0");
        data.getIsi(0).bunyi();
        data.getIsi(0).gerak();
        System.out.println("Data ke-1");
        data.getIsi(1).bunyi();
        data.getIsi(1).gerak();
        System.out.println("Data ke-2");
        data.getIsi(2).bunyi();
        data.getIsi(2).gerak();
    }
}