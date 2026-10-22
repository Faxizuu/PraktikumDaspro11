import java.util.Scanner;

public class StudiKasus11copy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargaperCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        
        System.out.print("Masukkan jumlah cup yang ingin dibeli: ");
        jumlahCup = scanner.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        uangBayar = scanner.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;
        totalBayar = totalHarga - diskon;
        
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            System.out.println("Tidak ada diskon yang diberikan.");
        }
        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp. " + kurang);
            scanner.close();
        }
    }
}