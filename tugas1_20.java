 import java.util.Scanner;

public class tugas1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiket = 0;
        int jumlahTiket = 0;
        double totalPenjualan= 0;
        final int hargaTiket = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan jumlah tiket yang valid.");
                continue;
            }

            if (jumlahTiket > 10) {
                double totalHarga = jumlahTiket * hargaTiket * 0.85;
                System.out.println("Total harga dengan diskon 15%: Rp " + totalHarga);
            } else if (jumlahTiket > 4 && <= 10) {
                double totalHarga = jumlahTiket * hargaTiket * 0.9;
                System.out.println("Total harga dengan diskon 10%: Rp " + totalHarga);
            } else {
                double totalHarga = jumlahTiket * hargaTiket;
                System.out.println("Total harga: Rp " + totalHarga);
            }

            totalTiket += jumlahTiket;
            totalPenjualan += jumlahTiket * hargaTiket;
            System.out.println("Total tiket yang dibeli: " + totalTiket);
            System.out.println("Total penjualan: Rp " + totalPenjualan);
        }

        sc.close();
    }
}   
