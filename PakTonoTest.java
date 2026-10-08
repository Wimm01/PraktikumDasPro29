import java.util.Scanner;

public class PakTonoTest {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lebar tanah");
        double lebartanah = sc.nextDouble();
        
        System.out.print("Panjang tanah");
        double panjangtanah = sc.nextDouble();

        System.out.print("Diameter kolam");
        double diameterkolam = sc.nextDouble();

        System.out.print("Sisi taman");
        double sisitaman = sc.nextDouble();

        double phi = 3.14;

        double luastanah = lebartanah * panjangtanah;
        double jarijarikolam = diameterkolam / 2;
        double luaskolam = phi * jarijarikolam * jarijarikolam;
        double luastaman = sisitaman * sisitaman;
        double luastanahtidakterpakai = luastanah - luaskolam - luastaman;

        System.out.println("Luas tanah =" + luastanah);
        System.out.println("Jari-jari kolam =" + jarijarikolam);
        System.out.println("Luas kolam =" + luaskolam);
        System.out.println("Luas taman =" + luastaman);
        System.out.println("Luas tanah tidak terpakai =" + luastanahtidakterpakai);


        sc.close();
    }
}