package MiniProjects;

import java.util.Scanner;

public class Otomat02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("KAHVE OTOMATINA HOSGELDINIZ\n");

        String[] urunler = new String[6];
        urunler[0]="LATTE";
        urunler[1]="MOCHA";
        urunler[2]="CAPPUCCINO";
        urunler[3]="CARAMEL MACCHİATO";
        urunler[4]="ESPRESSO";
        urunler[5]="HOT CHOCOLATE";

        double[] prices = new double[6];
        prices[0]=7.0;
        prices[1]=8.0;
        prices[2]=9.0;
        prices[3]=5.5;
        prices[4]=10.0;
        prices[5]=8.5;

    System.out.println("  No      Ürün       Fiyat");
    System.out.println("=====    =======    ========");
    for (int i = 0; i < urunler.length; i++) {
        System.out.println("  " + i + "      " + urunler[i] + "    " + prices[i] + " TL");
    }
    boolean bekle= false;
    double total = 0.0;
    while (!bekle) {

        System.out.println("Seçmek istediğiniz ürünün numarasını giriniz");
        String command = input.next();

        int productIndex = Integer.parseInt(command);

        double price = prices[productIndex];
        System.out.println("Seçtiğiniz ürün: " + prices[productIndex] + " - Fiyat: " + price + " TL");

        System.out.println("Para miktarını giriniz: ");
        double money = input.nextDouble();
        while (money < price) {
            System.out.println("Eksik para miktarı! Lütfen ekleyiniz: ");
            money += input.nextDouble();
        }
        double degistirme = money - price;
        if (degistirme > 0) {
            System.out.println("Para üstü: " + degistirme + " TL");
        }
        total += price;
        System.out.println("Devam etmek istiyor musunuz? (Evet: e / Hayır: h)");
        String option = input.next();

    }




    }
}

