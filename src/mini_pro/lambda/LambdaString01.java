package mini_pro.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaString01 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("elma","portakal","uzum","cilek","greyfurt",
                "nar","mandalina","armut","elma","keciboynuzu","elma"));


        said1(names);
        System.out.println();
        said2(names);
        System.out.println();
        System.out.println(said3(names));
        System.out.println();




        // 11.Soru ==> List elemanlarının ilk harfi e veya c olanları,
        //            Method referances ile aralarında boşluk bırakarak yazdıralım.

    }


    public static void said1 (ArrayList<String>names){

        names.stream().filter(t->t.startsWith("e")||t.startsWith("c")).forEach(Utils::yazdir);

    }

    // 12.Soru ==> List elemanlarının hepsinin naşına ve sonuna yıldız ekleyerey yazdıralım.

    public static void said2(ArrayList<String>names){
        names.stream().map(t->"*"+t+"*").forEach(Utils::yazdir);
    }

//13.Soru ==> List elemanlarının karakter sayısına göre büyükten küçüğe sıralayınız,
//            karakter sayısı en büyük ilk 3 elemanı,
//            list halinde return ederek yazdırınız.

public static List<String> said3(ArrayList<String>names){
  List<String> sonuc =  names.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).limit(3).collect(Collectors.toList());
return sonuc;
}
}
