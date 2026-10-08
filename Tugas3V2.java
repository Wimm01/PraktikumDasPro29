import java.util.Scanner;

public class Tugas3V2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode layanan: ");

        int kode=sc.nextInt();

        String layanan;
        String loket;

        switch (kode) {
            case 1:
                layanan = "Legalisir Ijazah";
                loket = "Loket A";
                break;
            case 2:
                layanan = "Surat Keterangan Aktif Kuliah";
                loket = "Loket B";
                break;
            case 3:
                layanan = "Pembayaran UKT";
                loket = "Loket C";
                break;
            case 4:
                layanan = "Pengajuan Cuti Akademik";
                loket = "Loket D";
                break;
            default:
                layanan = "Kode tidak dikenali";
                loket = "-";
                break;
        }

        System.out.println("Layanan: " + layanan);
        System.out.println("Loket :" + loket);

        sc.close();
    }
    
}
