import java.util.Scanner;
public class Pertanyaan42 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahElemen = sc.nextInt();

        int [] arrNilai = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++ ){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = 0;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i+1;
                break;
            }
        }

        System.out.println("Nilai " + key + " ketemu, " + " merupakan nilai mahasiswa ke-" + hasil);
    }
    
}  
