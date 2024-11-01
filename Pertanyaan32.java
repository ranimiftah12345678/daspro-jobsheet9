import java.util.Scanner;

public class Pertanyaan32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMahasiswa];
        int jumlahLulus = 0;

        for (int i=0; i< nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
        jumlahLulus++;
        }
    }
    System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
    }
}
