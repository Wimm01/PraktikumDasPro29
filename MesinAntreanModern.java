import java.util.Scanner;

public class MesinAntreanModern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode layanan: ");
        int kode = input.nextInt();

        String layanan = switch (kode) {
            case 1 -> "Legalisir Ijazah";
            case 2 -> "Surat Keterangan Aktif Kuliah";
            case 3 -> "Pembayaran UKT";
            case 4 -> "Pengajuan Cuti Akademik";
            default -> "Kode tidak dikenali";
        };

        String loket = switch (kode) {
            case 1 -> "Loket A";
            case 2 -> "Loket B";
            case 3 -> "Loket C";
            case 4 -> "Loket D";
            default -> "-";
        };

        System.out.println("Layanan: " + layanan);
        System.out.println("Loket  : " + loket);
        input.close();
    }
}