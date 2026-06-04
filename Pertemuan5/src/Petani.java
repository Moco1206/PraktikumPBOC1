/*  Nama file   : Petani.java
    Deskripsi   : kelas Petani turunan Manusia
    Pembuat     : Marco Falias Pangkado (24060124130112)
    Tanggal     : 28/03/2026
 */

public class Petani extends Manusia implements Pajak {
    //atribut
    private String asalKota;
    private static int counterPetani = 0;

    private static final int C = 1;

    //konst dgn parameter
    public Petani(String nama, String tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    //getter dan setter
    public String getAsalKota() {
        return asalKota;
    }

    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    //method lain
    @Override
    public int hitungMasaKerja() {
        return hitungSelisihTahun() + C;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota : " + asalKota);
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Pajak : " + hitungPajak());
    }
}