import java.util.Scanner;

public class PemilihanPercobaan220modif {
    public static void main(String[] args) {

        Scanner input20 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input20.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input20.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input20.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input20.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        
        if (total > 80 && total <= 100){
            System.out.println("Nilai akhir   : " + total + " Kualifikasi A (Sangat Baik)");
        } else if (total > 73 && total <= 80) {
            System.out.println("Nilai akhir   : " + total + " Kualifikasi B+ (Lebih dari baik)");
        } else if (total > 65 && total <= 73) {
            System.out.println("Nilai akhir   : " + total + " Kualifikasi B (Baik)");
        } else if (total > 60 && total <= 65) {
            System.out.println("Nilai akhir   : " + total + " Kualifikasi C+ (Lebih dari cukup)");
        } else if (total > 50 && total <= 60) {
            System.out.println("Nilai akhir   : " + total + " Kualifikasi C (Cukup)");
        } else if (total > 39 && total <= 50) {
            System.out.println("Nilai akhir   : " + total + " Kualifikasi D (Kurang)");
        } else { 
            System.out.println("Nilai akhir   : " + total + " Kualifikasi E (Gagal)");
        }
    }
}