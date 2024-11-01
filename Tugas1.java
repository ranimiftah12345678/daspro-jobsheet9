import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        int[] nilai = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = scanner.nextInt();
        }

        int totalNilai = 0;
        for (int nilaiMahasiswa : nilai) {
            totalNilai += nilaiMahasiswa;
        }
        double rataRata = (double) totalNilai / jumlahMahasiswa;

        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        System.out.println("\nNilai Mahasiswa:");
        for (int nilaiMahasiswa : nilai) {
            System.out.print(nilaiMahasiswa + " ");
        }
        System.out.println("\nNilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}
