import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Gaji pokok =");
        int gajipokok = sc.nextInt();

        System.out.print("Tunjangan per anak =");
        int tunjanganperanak = sc.nextInt();

        System.out.print("Jumlah anak= ");
        int jmlanak = sc.nextInt();

        double perspotdapens = 0.10;

        int totaltunpernak = tunjanganperanak * jmlanak;
        double totalpotonganpensiun = gajipokok * perspotdapens;
        double gajibersih = gajipokok + totaltunpernak - totalpotonganpensiun;

        System.out.println("Total tunjangan per anak" + totaltunpernak);
        System.out.println("Total potongan dana pensiun" + totalpotonganpensiun);
        System.out.println("Gaji bersih Pak Danur" + gajibersih);

        sc.close();

    }
}