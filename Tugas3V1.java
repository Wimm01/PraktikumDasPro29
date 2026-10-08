import java.util.Scanner;

public class Tugas3V1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan lama parkir (jam): ");

        int lamaParkir = sc.nextInt();

        int tarif;

        if (lamaParkir <= 2) {
            tarif = 2000;
        } else {
            tarif = 2000 + ((lamaParkir - 2) * 1000);
        }

        System.out.println("Lama parkir : " + lamaParkir + " jam");
        System.out.println("Tarif parkir: Rp" + tarif);

        sc.close();
    }
    
}