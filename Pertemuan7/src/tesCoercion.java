public class tesCoercion {

    static String S;
    static Integer A
    ;
    //tes coercion
    public static void coercion() {
        int nilaiInt = 65;

        char nilaiChar = (char) nilaiInt;
        double nilaiDouble = (double) nilaiInt;
        System.out.println("tes Coercion");
        System.out.println("Integer: " + nilaiInt);
        System.out.println("Char: " + nilaiChar);
        System.out.println("Double: " + nilaiDouble);
        System.out.println();
    }

    // b. double kembali ke int
    public static void doubleToInt() {
        int nilaiInt = 65;
        double nilaiDouble = (double) nilaiInt;
        int nilaiIntBaru = (int) nilaiDouble;

        System.out.println("dari dobel balikin ke int");
        System.out.println("Double: " + nilaiDouble);
        System.out.println("Integer kembali: " + nilaiIntBaru);
        System.out.println();
    }

    // c. String ke int
    public static void stringToInt() {
        String X = "1234";
        String Y = "5678";

        S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("string ke integer");
        System.out.println("S (gabungan): " + S);
        System.out.println("Z (penjumlahan): " + Z);
        System.out.println();
    }

    // d. String ke double
    public static void stringToDouble() {
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("string ke double");
        System.out.println("R (gabungan): " + R);
        System.out.println("D (penjumlahan): " + D);
        System.out.println();
    }

    // e
    public static void tesApaKek() {
        A = Integer.parseInt(S);

        System.out.println("A yg interger diisi nilai S");
        System.out.println("A: " + A);
        System.out.println();
    }

    // f
    public static void stringDiisiA() {
        String T = A.toString();

        System.out.println("pokoe poin f ");
        System.out.println("T: " + T);
        System.out.println();
    }

}