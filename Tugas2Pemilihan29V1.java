import java.util.Scanner;

public class Tugas2Pemilihan29V1{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Validasi KRS SIAKAD ---");
        System.out.println("Masukkan jumlah sks yang diambil: ");

        int jumlahSks=sc.nextInt();
        
        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }

    }

}