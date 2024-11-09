import java.util.Scanner;

public class MenghitungGaji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gaji, lemburUpah, lemburJam, bonus;
        bonus = 0;

        System.out.print("Masukan Gaji : ");
        gaji = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukan Jam Lembur : ");
        lemburJam = sc.nextInt();
        sc.nextLine();
        sc.close();

        //kalkulasi upah lembur
        lemburUpah = gaji/173;
        lemburUpah = lemburUpah*lemburJam;
        if (lemburJam >= 4) {
            bonus = lemburUpah*2;
        }
        gaji = gaji + lemburUpah + bonus;

        System.out.println("Upah Anda Adalah : "+gaji);
    }
}
