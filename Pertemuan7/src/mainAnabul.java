public class mainAnabul {
    public static void main(String[] args) {

        Anabul a1 = new Kucing("Kocheng");
        Anabul a2 = new Anjing("Asu");
        Anabul a3 = new Burung("manuk");

        a1.gerak();
        a1.bunyi();
        System.out.println();
        a2.gerak();
        a2.bunyi();
        System.out.println();
        a3.gerak();
        a3.bunyi();
    }
}