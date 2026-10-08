import java.util.Scanner;

public class Pertemuan7Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan password: ");
        String password = sc.nextLine();
        System.out.print("Status perangkat (Y/T): ");
        String statusPerangkat = sc.next().trim();
        System.out.print("Jumlah login gagal sebelumnya (0-2): ");
        int gagal = sc.nextInt();

        if (password.equals("daspro2026")) {
            if (statusPerangkat.equalsIgnoreCase("Y")) {
                System.out.println("Login berhasil, selamat datang di dashboard");
            } else {
                System.out.println("Kode OTP telah dikirim ke email kampus Anda");
            }
        } else {
            if (gagal < 2) {
                System.out.println("Password salah, silakan coba lagi");
            } else {
                System.out.println("Akun dikunci selama 15 menit");
            }
        }
    }
}