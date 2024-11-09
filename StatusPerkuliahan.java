import java.util.ArrayList;
import java.util.Scanner;
public class StatusPerkuliahan {
    public static void main(String[] args) {
        ArrayList<String> namaMataKuliah = new ArrayList<>();
        ArrayList<String> kode = new ArrayList<>();
        ArrayList<Integer> sks = new ArrayList<>();
        ArrayList<String> hurufMutu = new ArrayList<>();
        ArrayList<Double> bobot = new ArrayList<>();
        ArrayList<Double> nilai = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa;
        int semester;

        namaMataKuliah.add("Nilai Dasar Shalih Akram");
        namaMataKuliah.add("Teologi Aswaja");
        namaMataKuliah.add("Civic Education");
        namaMataKuliah.add("Ulumul Qur'an");
        namaMataKuliah.add("Sejarah Pemikiran dan Keuangan Perbankan");
        namaMataKuliah.add("Bahasa Arab |");
        namaMataKuliah.add("Bahasa Inggris |");
        namaMataKuliah.add("Pengantar Ekonomi Mikro");
        namaMataKuliah.add("Manajemen Syariah");
        namaMataKuliah.add("Bahasa Indonesia");

        kode.add("PS0101");
        kode.add("PS0102");
        kode.add("PS0104");
        kode.add("PS0201");
        kode.add("PS0203");
        kode.add("PS0205");
        kode.add("PS0207");
        kode.add("PS0209");
        kode.add("PS0218");
        kode.add("PS0227");
        kode.add("PS0416");

        sks.add(2);
        sks.add(2);
        sks.add(2);
        sks.add(2);
        sks.add(2);
        sks.add(2);
        sks.add(2);
        sks.add(3);
        sks.add(2);
        sks.add(2);
        sks.add(2);

        hurufMutu.add("B");
        hurufMutu.add("A-");
        hurufMutu.add("A-");
        hurufMutu.add("A-");
        hurufMutu.add("B+");
        hurufMutu.add("B-");
        hurufMutu.add("B");
        hurufMutu.add("A-");
        hurufMutu.add("A-");
        hurufMutu.add("A-");
        hurufMutu.add("A-");

        bobot.add(3.00);
        bobot.add(3.50);
        bobot.add(3.50);
        bobot.add(3.50);
        bobot.add(3.25);
        bobot.add(2.75);
        bobot.add(3.00);
        bobot.add(3.50);
        bobot.add(3.50);
        bobot.add(3.50);
        bobot.add(3.50);

        nilai.add(70.00);
        nilai.add(83.10);
        nilai.add(88.00);
        nilai.add(80.60);
        nilai.add(79.50);
        nilai.add(68.00);
        nilai.add(72.45);
        nilai.add(82.00);
        nilai.add(84.50);
        nilai.add(83.80);
        nilai.add(80.00);

        System.out.print("Masukan Nama Mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Masukan Semester : ");
        semester = sc.nextInt();
        sc.nextLine();
        System.out.println();

        System.out.println("Nama Mahasiswa : "+namaMahasiswa+" | Semester : "+semester);
        System.out.println("=========================================================================================");
        System.out.printf("%-3s %-7s %-45s %-5s %-11s %-7s %-7s\n", "NO", "KODE", "MATA KULIAH", "SKS", "HURUF MUTU", "BOBOT", "NILAI");
        for (int i = 0; i < namaMataKuliah.size(); i++) {
            System.out.printf("%-3d %-7s %-45s %-5d %-11s %-7.2f %-7.2f\n", (i+1), kode.get(i), namaMataKuliah.get(i), sks.get(i), hurufMutu.get(i), bobot.get(i), nilai.get(i));
        }
        sc.close();
    }   
}
