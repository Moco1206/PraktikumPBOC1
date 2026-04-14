/*  Nama file   : PNS.java
    Deskripsi   : kelas PNS turunan dari Manusia
    Pembuat     : Marco Falias Pangkado (24060124130112)
    Tanggal     : 28/03/2026
 */

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    private static final int A = 2; 
    public PNS(String nama, String tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, String tglMulaiKerja, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        return hitungSelisihTahun() + A;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP : " + nip);
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Pajak : " + hitungPajak());
    }
}