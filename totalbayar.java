import java.util.Scanner;
public class totalbayar {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Harga = ");
        int harga = sc.nextInt();

        System.out.print("Saldo anda = ");
        double wangmuk = sc.nextDouble();

        double diskon=0.02;

        double pothar = diskon * harga;
        double jml_bayar = harga - pothar;
        double sisa_uang = wangmuk - jml_bayar;

        System.out.println("Harga yang harus anda bayar adalah Rp" + jml_bayar);

        System.out.println("Potognan harga yang sudah anda dapatkan adalah Rp" + pothar);

        System.out.println("Sisa saldo anda sekarang Rp" + sisa_uang);

        System.out.println("Terima kasih sudah berbelanja di Imee.co! Kami nantikan kedatangan anda kembali.");


        sc.close();
    }
}
