import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {

        Scanner input20 = new Scanner(System.in);
        
        int username = 12345;
        int password = 00000;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        int usernameInput = input20.nextInt();
        System.out.print("Masukkan password: ");
        int passwordInput = input20.nextInt();

        //cek value
        if (usernameInput == username && passwordInput == password) {
            System.out.println("Berhasil Login");
        } else {
            System.out.println("Username dan password salah");
        }
    }
}