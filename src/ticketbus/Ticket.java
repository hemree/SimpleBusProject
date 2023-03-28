package ticketbus;

import java.util.Scanner;

public class Ticket {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int km = 0;
        int yas = 0;
        int yolculukTipi = 1;
        String plakaNumarasi =" 34 PK 5555";
        System.out.println("LUTFEN GIDECGINIZ MESAFEYI KILOMETRE OLARAK VERINIZ ...");
        km = input.nextInt();
        System.out.println("lutfen yasinizi giriniz");
        yas = input.nextInt();

        System.out.println("lutfen yolculuk tipini giriniz.Sadece gidis ise 1-\n" +
                "gidis-donus ise 2-'ye basiniz" +
                " \n");
        yolculukTipi = input.nextInt();
        if (km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double biletUcreti = km * 0.10;
            double yasIndirimOran = 0;
            if (yas < 12) {
                yasIndirimOran = 0.5;

            } else if (yas < 24) {
                yasIndirimOran = 0.1;
            } else if (yas > 65) {
                yasIndirimOran = 0.3;

            }
            biletUcreti -= biletUcreti * yasIndirimOran;
            if (yolculukTipi == 2) {
                biletUcreti = biletUcreti * 0.2;
                System.out.println("Gidiş Dönüş indirimi aldınız..");
                biletUcreti = biletUcreti * 0.80;

            }
            System.out.println("Toplam bilet ücretiniz : " + biletUcreti + "$" +
                    "\n*** HAYIRLI YOLCULUKLAR ***");
        }

        biletDokum(plakaNumarasi, km, yolculukTipi);

    }
    private static void biletDokum(String plakaNumarasi, int km, int yolculukTipi) {

        System.out.println("==========BILET DOKUM=========");
        System.out.println("OTOBUSUN PLAKASI : " + plakaNumarasi);
        System.out.println("mesafe : " + km);
        System.out.println("yolculuk tipi : " + (yolculukTipi == 1 ? "tek yon" : "gidis donus"));


        slowPrint("KEYIFLI YOLCULUKLAR DILERIZ.",100);
    }
    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
