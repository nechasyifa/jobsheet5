import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {

        Scanner input20 = new Scanner(System.in);
        
        String username = "necha";
        String password = "tifast";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = input20.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = input20.nextLine();

        //cek value
        if (usernameInput.equals(username) && passwordInput.equals(password)) {
            System.out.println("Berhasil Login");
        } else {
            System.out.println("Username dan password salah");
        }
    }
}