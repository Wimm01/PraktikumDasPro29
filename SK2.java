import java.util.Scanner;

public class SK2 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen, peringkat, statusPKM;

        System.out.print("Nama mahasiswa: ");
        nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine().trim().toUpperCase();

        //Bagian 1
        if (jenisKegiatan.equals("BELMAWA") || jenisKegiatan.equals("BAKORMA") || jenisKegiatan.equals("MANDIRI")) {

            System.out.print("Jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();

            System.out.print("Peringkat juara (isi 0 jika bukan juara): ");
            peringkat = sc.nextInt();
            
            
            
            //Bagian 2
            if (peringkat >= 1 && peringkat <= 3) {
                //Bagian 3
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equals("PKM")) {

            System.out.print("Jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();
            
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPKM = sc.nextInt();

            
            
            //Bagian 2
            if (statusPKM == 1) {
                //Bagian 3
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
            }


        } else {
            System.out.println("Status: Kegiatan Lainnya tidak memperoleh dana penghargaan.");
        }
        sc.close();

    }
}
