import java.util.Scanner;

/***
 * Ini adalah kelas untuk menghitung faktorial
 * Memanfaatkan fitur scanner agar user bisa memasukkan angka yang ingin difaktorialkan sendiri
 */
public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka yang akan difaktorialkan: ");
        int angka = input.nextInt();
        int hasil = 1;
        for (int i = 1; i <= angka; i++) {
            hasil *= i;
        }

        System.out.println("Angka sebelum di faktorial kan      : " + angka);
        System.out.println("Hasil angka setelah difaktorialkan  : " + hasil);
    }


}
