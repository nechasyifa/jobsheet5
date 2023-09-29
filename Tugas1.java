import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner input20 = new Scanner(System.in);

        System.out.print("Masukkan jarak: ");
        int jarak = input20.nextInt();
            
        String output = jarak <= 5 ? " melee weapon" : " ranged weapon";

        System.out.println("Jarak " + jarak + " meter, gunakan" + output);
    }
}