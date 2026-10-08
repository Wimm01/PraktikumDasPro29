import java.util.Scanner;
public class jilidlembar {
    public static void main(String[] args){

        System.out.println("Harga kertas per lembarnya adalah Rp500");
        System.out.println("Harga penjilidan = Rp5000");

        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah lembar kertas = ");
        int jumtas=sc.nextInt();

        double total_bayar = jumtas * 500 + 5000;
        
        System.out.println("Jumlah yang harus dibayar = Rp" + total_bayar);

        sc.close();
    }
    
}
