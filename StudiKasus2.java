import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Berapa panjang tanah? ");
        int pjtn = sc.nextInt();

        System.out.print("Berapa lebar tanah? ");
        int lbtn = sc.nextInt();

        System.out.print("Berapa diameter kolam? ");
        double dtrklm = sc.nextDouble();

        System.out.print("Berapa sisi taman");
        int sistmn = sc.nextInt();

        double phi=3.14;

        int lstn = pjtn * lbtn;
        double jjk = dtrklm / 2;
        double lsklm = phi * jjk * jjk;
        int lstmn = sistmn * sistmn;
        double luastktrpkai = lstn - lsklm - lstmn;

        System.out.println("Luas Tanah Pak Tono Yang Tak Terpakai");
        System.out.println("Luas tanah = " + lstn);
        System.out.println("Jari jari kolam = " + jjk);
        System.out.println("Luas kolam = " + lsklm);
        System.out.println("Luas taman = " + lstmn);
        System.out.println("Luas tanah tak terpakai = " + luastktrpkai);

        sc.close();

    }
}