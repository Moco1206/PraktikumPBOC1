public class Seminar {

    private CivitasAkademika[] peserta;
    private int banyakPeserta;

    // b
    public Seminar() {
        peserta = new CivitasAkademika[100];
        banyakPeserta = 0;
    }

    // c
    public int countPeserta() {
        return banyakPeserta;
    }

    // d
    public void registrasi(CivitasAkademika c) {
        if (banyakPeserta < 100) {
            peserta[banyakPeserta] = c;
            banyakPeserta++;
        } else {
            System.out.println("Seminar full ges");
        }
    }

    // g
    public void tampilPeserta() {
        System.out.println("Daftar Peserta");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(
                peserta[i].getNomor() + " -- " + peserta[i].getNama()
            );
        }
        System.out.println();
    }

    // h
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (peserta[i] instanceof MahasiswaSeminar) {
                count++;
            }
        }
        return count;
    }
}