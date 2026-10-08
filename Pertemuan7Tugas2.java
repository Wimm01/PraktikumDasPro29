import java.util.Scanner;

public class Pertemuan7Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode hari (1-7): ");
        int kodeHari = sc.nextInt();

        switch (kodeHari) {
            case 1:
            case 2:
            case 5: {
                System.out.print("Status seragam (Y/T): ");
                String status = sc.next().trim();

                if (status.equalsIgnoreCase("Y")) {
                    System.out.println("Boleh mengikuti perkuliahan");
                } else {
                    System.out.println("Dikenakan sanksi, tidak boleh mengikuti perkuliahan");
                }
                break;
            }
            case 3:
            case 4:
                System.out.println("Boleh memakai pakaian bebas yang rapi dan sopan");
                break;
            case 6:
            case 7:
                System.out.println("Tidak ada perkuliahan");
                break;
            default:
                System.out.println("Kode hari tidak valid");
        }
    }
}