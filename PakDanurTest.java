import java.util.Scanner;

public class PakDanurTest {
    
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Gaji pokok = ");
        int gajipokok = sc.nextInt();

        System.out.print("Tunjangan per anak =");
        int tunjanganperanak = sc.nextInt();

        System.out.print("Jumlah anak =");
        int jumlahanak = sc.nextInt();

        double persenanpensiun = 0.10;

        int totaltunjanganperanak = tunjanganperanak * jumlahanak;
        double totalpersenan = gajipokok * persenanpensiun;
        double gajibersih = gajipokok + totaltunjanganperanak - totalpersenan;

        System.out.println("Total tunjangan per anak =" + totaltunjanganperanak);
        System.out.println("Total persenan pensiun =" + totalpersenan);
        System.out.println("Gaji bersih =" + gajibersih);

        sc.close();
    } 
    
}
