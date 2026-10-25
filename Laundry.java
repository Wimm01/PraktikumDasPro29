//PERTEMUAN 7 DASAR PEMROGRAMAN
import java.util.Scanner;

public class Laundry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat cucian (kg): ");
        int berat = input.nextInt();

        int tarifPerKg;

        if (berat < 3) {
            tarifPerKg = 7000;
        } else if (berat <= 6) {
            tarifPerKg = 6000;
        } else {
            tarifPerKg = 5000;
        }

        int totalBiaya = berat * tarifPerKg;

        System.out.println("Tarif per kg : Rp" + tarifPerKg);
        System.out.println("Total biaya  : Rp" + totalBiaya);

        input.close();
    }
}