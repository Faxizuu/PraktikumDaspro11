import java.util.Scanner;

public class StudiKasus211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = input.nextLine().trim().toUpperCase();
        String status;

        if (jenis.equals("LAINNYA")) {
            status = "Kegiatan Lainnya tidak memperoleh dana penghargaan.";

        } else if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            int juara = input.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    status = "Dokumen lengkap dan meraih Juara " + juara
                            + ". Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Bukan Juara 1, 2, atau 3. Dana penghargaan tidak diberikan.";
            }

        } else if (jenis.equals("PKM")) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = input.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int lolos = input.nextInt();

            if (lolos == 1) {
                if (dokumen == 4) {
                    status = "Tim lolos pendanaan PKM dan dokumen lengkap. Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Tim tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan.";
            }

        } else {
            status = "Jenis kegiatan tidak dikenali. Periksa kembali input.";
        }

        System.out.println("Status : " + status);
        input.close();
    }
}