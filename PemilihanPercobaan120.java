import java.util.Scanner;

public class PemilihanPercobaan120 {
    public static void main(String[] args) {

        Scanner input20 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input20.nextInt();
            
        String output = angka % 2 == 0 ? " bilangan genap" : " bilangan ganjil";

        System.out.println("Angka " + angka + " adalah" + output);
    }
}