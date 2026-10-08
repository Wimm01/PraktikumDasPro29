import java.util.Scanner;

public class ruangpersegi{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int panjang;
        int luas;
        int lebar;

        panjang=sc.nextInt();
        lebar=sc.nextInt();
        luas=panjang*lebar;

        System.out.println("Luas persegi adalah = " + luas);

        sc.close();

    }

}