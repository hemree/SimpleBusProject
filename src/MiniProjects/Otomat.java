package MiniProjects;


import java.util.Scanner;
import java.util.TreeMap;

public class Otomat{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("KAHVE OTOMATINA HOSGELDINIZ\n");
        TreeMap<String, Integer> urunler = new TreeMap<>();
        urunler.put("1 ==> LATTE",6);
        urunler.put("2 ==> MOCHA",7);
        urunler.put("3 ==> CAPPUCCİNO",6);
        urunler.put("4 ==> CARAMEL LATTE",7);
        urunler.put("5 ==> ESPRESSO",5);


        char secim = ' ';
        double toplamtutar =0;

        switch (secim){
            case '1':
                toplamtutar =+ urunler.get("LATTE");
                break;
            case '2':
                toplamtutar+=urunler.get("MOCHA");
                break;
            case '3':
                toplamtutar+=urunler.get("CAPPUCİNO");
                break;
            case '4':
                toplamtutar+=urunler.get("CARAMEL LATTE");
                break;
            case '5':
                toplamtutar+=urunler.get("ESPRESSO");
                break;
        }











    }
}
    