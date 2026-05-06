// Marco
// 24060124130112

public class MainKucing {
    public static void main(String[] args) {
        Anggora a = new Anggora("Joko", 3.3);
        KembangTelon k = new KembangTelon("Wowo", 12.7);
        a.gerak();
        a.bunyi();
        System.out.println("Bobot: " + a.getBobot() + " kg");
        System.out.println();
        k.gerak();
        k.bunyi();
        System.out.println("Bobot: " + k.getBobot() + " kg");
    }
}