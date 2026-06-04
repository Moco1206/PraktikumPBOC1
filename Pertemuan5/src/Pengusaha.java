/*  Nama file   : Pengusaha.java
    Deskripsi   : kelas Pengusaha turunan Manusia
    Pembuat     : Marco Falias Pangkado (24060124130112)
    Tanggal     : 28/03/2026
 */

public class Pengusaha extends Manusia implements Pajak {

    //atribut
    private String npwp;
    private static int counterPengusaha = 0;

    private static final int B = 1; 

    //konst dgn parameter
    public Pengusaha(String nama, String tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //getter dan setter
    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    //method lain
    @Override
    public int hitungMasaKerja() {
        return hitungSelisihTahun() + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP : " + npwp);
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Pajak : " + hitungPajak());
    }
}