import java.util.Scanner;

public class tugas2_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis = -1, durasi, total;

        System.out.println("Selamat datang di parkiran rido");
        System.out.println("Jenis kendaraan:");
        System.out.println("1. Sepeda motor");
        System.out.println("2. Mobil");

        while (jenis !=0) {
            System.out.print("masukkan jenis kendaraannya bre (1/2):");
            jenis = sc.nextInt();

            if (jenis == 1) {
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = sc.nextInt();
                total = durasi * 2000;
                System.out.println("Total biaya parkir: Rp " + total);
            } else if (jenis == 2) {
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = sc.nextInt();
                total = durasi * 3000;
                System.out.println("Total biaya parkir: Rp " + total);
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            }
        }

        sc.close();
    }
}