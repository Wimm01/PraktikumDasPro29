import java.util.Scanner;

public class Pertemuan7Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berat cucian (kg): ");
        int berat = sc.nextInt();

        int tarif;

        if (berat < 3) {
            tarif = 7000;
        } else if (berat >= 3 && berat <= 6) {
            tarif = 6000;
        } else {
            tarif = 5000;
        }

        int total = berat * tarif;

        System.out.println("Tarif per kg: Rp" + tarif);
        System.out.println("Total biaya: Rp" + total);
    }
}