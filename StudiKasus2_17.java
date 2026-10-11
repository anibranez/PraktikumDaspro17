
import java.util.Scanner;
public class StudiKasus2_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama,jenisKegiatan,statusDokumen,statusDana;
        int jumlahDokumen,peringkatJuara;

        System.out.print("Nama Mahasiswa: ");
        nama = sc.nextLine();
        System.out.print("Jenis Kegiatan: ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah Dokumen: ");
        jumlahDokumen = sc.nextInt();
        System.out.print("Peringkat Juara: ");
        peringkatJuara = sc.nextInt();

        if(jenisKegiatan.equalsIgnoreCase("belmawa")||
           jenisKegiatan.equalsIgnoreCase("bakorma")||
            jenisKegiatan.equalsIgnoreCase("mandiri")) {
                if (jumlahDokumen == 4) {
                    statusDokumen = "Dokumen lengkap";
                    statusDana = "Dana peghargaan diberikan";
                    if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                        statusDokumen = "Dokumen lengkap";
                        statusDana = "Dana peghargaan diberikan";
                    } else {
                        statusDokumen = "Dokumen lengkap";
                        statusDana = "Dana peghargaan tidak diberikan";
                    }
                } else {
                    statusDokumen = "Dokumen tidak lengkap";
                    statusDana = "Dana peghargaan tidak diberikan";
                }
                System.out.println("Status Dokumen: " + statusDokumen + " . " + statusDana);
        }

        
    }
}