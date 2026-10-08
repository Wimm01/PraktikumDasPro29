import java.util.Scanner;

public class js5tugas129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jenis buku (kamus/novel/lainnya): ");
        String jenis = sc.nextLine().trim();
        System.out.print("Jumlah buku: ");
        int jumlah = sc.nextInt();
        System.out.print("Harga satuan: ");
        double harga = sc.nextDouble();

        double diskon = 0;

        if (jenis.equalsIgnoreCase("kamus")) {
            diskon = 10;
            if (jumlah > 2) {
                diskon += 2;
            }
        } else if (jenis.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jumlah > 3) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else {
            if (jumlah > 3) {
                diskon = 5;
            }
        }

        double total = harga * jumlah;
        double potongan = total * diskon / 100;
        double bayar = total - potongan;

        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Jumlah diskon: Rp" + potongan);
        System.out.println("Total yang harus dibayar: Rp" + bayar);
    }
}