import java.util.Scanner;

public class StudiKasus211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenis;
        int jumlahDokumen, peringkat, kurang;

        // Input data umum
        System.out.print("Nama mahasiswa  : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = sc.nextLine().trim().toUpperCase();
        System.out.print("Jumlah dokumen  : ");
        jumlahDokumen = sc.nextInt();

        kurang = 4 - jumlahDokumen;

        // Tingkat 1: apakah termasuk lomba?
        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            System.out.print("Peringkat juara : ");
            peringkat = sc.nextInt();

            // Tingkat 2: apakah Juara 1, 2, atau 3?
            if (peringkat >= 1 && peringkat <= 3) {
                // Tingkat 3: apakah dokumen lengkap?
                if (jumlahDokumen >= 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " + peringkat + ", dokumen lengkap).");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
        }
        // Cabang PKM dan Lainnya akan ditambahkan di langkah berikutnya
    }
}