package MiniProjects;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        System.out.println("    Markete Hoş Geldiniz\n " +
                "  No      Ürün       Fiyat\n" +
                "=====    =======    ========\n" +
                "  0      Domates    2.10 TL\n" +
                "  1      Patates    3.20 TL\n" +
                "  2      Biber      1.50 TL\n" +
                "  3      Soğan      2.30 TL\n" +
                "  4      Havuç      3.10 TL\n" +
                "  5      Elma       1.20 TL\n" +
                "  6      Muz        1.90 TL\n" +
                "  7      Çilek      6.10 TL\n" +
                "  8      Kavun      4.30 TL\n" +
                "  9      Üzüm       2.70 TL\n" +
                "  10     Limon      0.50 TL");
        //Urunler
        String[] urunler = new String[11];
        urunler[0] = "Domates 2.10 DOLAR";
        urunler[1] = "Patates 3.20 DOLAR";
        urunler[2] = "Biber 1.50 DOLAR";
        urunler[3] = "Soğan 2.30 DOLAR";
        urunler[4] = "Havuç 3.10 DOLAR";
        urunler[5] = "Elma 1.20 DOLAR";
        urunler[6] = "Muz 1.90 DOLAR";
        urunler[7] = "Çilek 6.10 DOLAR";
        urunler[8] = "Kavun 4.30 DOLAR";
        urunler[9] = "Üzüm 2.70 DOLAR";
        urunler[10] = "Limon 0.50 DOLAR";
        //Fiyatlar
        double[] urunFiyat = new double[11];
        urunFiyat[0] = 2.10;
        urunFiyat[1] = 3.20;
        urunFiyat[2] = 1.50;
        urunFiyat[3] = 2.30;
        urunFiyat[4] = 3.10;
        urunFiyat[5] = 1.20;
        urunFiyat[6] = 1.90;
        urunFiyat[7] = 6.10;
        urunFiyat[8] = 4.30;
        urunFiyat[9] = 2.70;
        urunFiyat[10] = 0.50;
        Scanner input = new Scanner(System.in);
        float toplamSepetTutari = 0;
        String secim = "";
        int urunNo;
        while (true){
            System.out.println(" \nLüfen ürün no seçiniz : ");
            secim = input.next();
            if (secim.equalsIgnoreCase("0")){
                System.out.println("Ödemeniz Gereken Tutar : " +toplamSepetTutari + " Dolar");
                break;
            }else {
                urunNo = Integer.parseInt(secim);
            }
            System.out.println(" \nLüfen Kaç Kilo Almak istediğinizi yazınız : ");
            double kacKilo = input.nextDouble();
            toplamSepetTutari += kacKilo * urunFiyat[urunNo];
            System.out.println("Sepet Tutarınız : " +toplamSepetTutari + " Dolar");
        }














        
    }
    }

