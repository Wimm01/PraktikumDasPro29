import java.util.Scanner;
public class gajikaryawan {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp=600000;
        double tunjMkn=400000;

        gajiPokok=sc.nextInt();
        
        bonus=0.05*gajiPokok;
        totGaji=gajiPokok+tunjTransp+tunjMkn-(0.1*gajiPokok);

        System.out.println("Bonus bulanan anda adalah Rp" +bonus);
        System.out.println("Gaji yang diterima adalah Rp" +totGaji);
    }
}
