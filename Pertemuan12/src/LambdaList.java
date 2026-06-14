/* Nama File    : LambdaList.java
 * Deskripsi    : Program main yang digunakan untuk menampilkan nama-nama mahasiswa dari List menggunakan ekspresi lambda.
 * Pembuat      : Marco Falias Pangkado
 * Tanggal      : 5 juni 2026
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // Lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}

//nesa tai