package mini_pro.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        /*
    1.Soru ==> List elemanlarının çift ve pozitif olanlarını,
               Lambda Expression kllanarak aralarında boşluk
               olacak şekilde yazdırın.
     */

        ArrayList<Integer> sayi = new ArrayList<>(Arrays.asList(-5,42,58,-11,-5,94,8,11));

        said1(sayi);
        System.out.println();
        said2(sayi);
        System.out.println();
        said3(sayi);
        System.out.println();
        said4(sayi);
        System.out.println();
        said5(sayi);
        System.out.println();
        said6(sayi);
        System.out.println();
        said7(sayi);
        System.out.println();
        System.out.println(said8(sayi));
        System.out.println();
        System.out.println(said9(sayi));
        System.out.println();


    }
    public static void said1 (ArrayList<Integer> sayi){
        sayi.stream().filter(t->t%2==0&& t>0).forEach(Utils::yazdir);
    }
    /*
3.Soru ==> List elemanlarının karelerini, aralarında boşluk olacak şeklide yazdırınız.

     */

    public static void  said2 (ArrayList<Integer> sayi){
        sayi.stream().map(Utils::getSquare).forEach(Utils::yazdir);
    }
    // 4.Soru ==> List elemanlarının karelerini, tekrarsız yazdırın.

    public static void said3(ArrayList<Integer> sayi){
        sayi.stream().map(Utils::getSquare).distinct().forEach(Utils::yazdir);
    }
    //5.Soru ==> List elemanlarını büyükten küçüğe sıralayarak yazdırın.

    public static void said4(ArrayList<Integer> sayi){
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);
    }
    /*
    6.Soru ==> List elemanlarının pozitif olanlarının,
           kuplerini bulup,
           birler basamağı 2 olanları yazdırınız.
     */
    public static void said5(ArrayList<Integer> sayi){
        sayi.stream().filter(t->t>0).map(Utils::said5).filter(t->t%10==2).forEach(Utils::yazdir);
    }
    // 7.Soru ==>List Elemanlarının Method References ile toplamını bulun ve yazdırın.

    public static void said6(ArrayList<Integer> sayi){
       Optional<Integer> sonuc1 = sayi.stream().reduce(Integer::sum);
        System.out.println(sonuc1);
    }
    // 8.Soru ==>List Elemanlarının Lambda Expression ile toplamını bulun ve yazdırın.

    public static void said7(ArrayList<Integer>sayi){
        int sonuc2 = sayi.stream().reduce(0,(t,u)->t+u);
        System.out.println(sonuc2);
    }
    // 9.Soru ==> List'in Pozitif elemanlarının çarpımını,
    //           Lambda Expression ile return ederek yazdırınız.

    public static int said8(ArrayList<Integer>sayi){
      int sonuc3 =   sayi.stream().filter(t->t>0).reduce(1,(t,u)->t*u);
        return sonuc3;
    }
// 10.Soru ==> List'in çift elemanlarının, karelerini,
//            küçükten büyüğe sıralayıp list halinde return ederek yazdırınız.

    public static List<Integer> said9(ArrayList<Integer>sayi){
       List<Integer> sonuc4 =  sayi.
               stream().
               filter(t->t%2==0).
               sorted().
               map(Utils::getSquare).
               collect(Collectors.toList());
       return sonuc4;
    }
}
