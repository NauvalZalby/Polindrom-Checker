import java.util.Scanner;
/***
 * fungsi polindrome checker adalah untuk memeriksa apakah sebuah kata, frasa, atau urutan karakter tertentu
 * dapat dibaca dengan sama baik dari depan maupun dari belakang.
 */
public class Polindrom_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Ini adalah palindrom.");
        } else {
            System.out.println("Ini bukan palindrom.");
        }

        scanner.close();
    }
f
    public static boolean isPalindrome(String input) {
        // Menghapus spasi dan mengubah semuanya menjadi huruf kecil
        input = input.replaceAll("\\s", "").toLowerCase();

        int length = input.length();

        // Memeriksa karakter-karakter sesuai dari awal dan akhir
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }
}