import java.util.Scanner;

public class js5tugas229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean aktif = sc.nextBoolean();
        System.out.print("Apakah sedang disanksi akademik? (true/false): ");
        boolean sanksi = sc.nextBoolean();

        if (aktif && !sanksi) {
            System.out.print("Nilai Dasar Pemrograman: ");
            int nilaiDP = sc.nextInt();
            System.out.print("Punya sertifikat kompetensi pemrograman? (true/false): ");
            boolean sertifikat = sc.nextBoolean();

            if (nilaiDP >= 80 || sertifikat) {
                System.out.print("Nilai wawancara: ");
                int nilaiWawancara = sc.nextInt();

                if (nilaiWawancara >= 75) {
                    System.out.println("Selamat! Mahasiswa diterima sebagai asisten praktikum");
                } else {
                    System.out.println("Gagal! Nilai wawancara kurang dari 75");
                }
            } else {
                System.out.println("Gagal! Nilai Dasar Pemrograman kurang dari 80 dan tidak punya sertifikat");
            }
        } else {
            System.out.println("Gagal! Mahasiswa tidak aktif atau sedang disanksi akademik");
        }
    }
}