package Abd_Practics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P02 {

        /*
             Basit bir 5 ürünlü manav alisveris programi yaziniz.

                1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
                2. Adim : Baska bir urun almak isteyip istemedigini sor.
                           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
                           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
                3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
                4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         */
       static ArrayList<String> urunListesi=new ArrayList<>(Arrays.asList("1.Domates","2.Sogan","3.Portakal","4.Elma","5.Kivi"));

        static ArrayList<Integer> fiyatListesi=new ArrayList<>(Arrays.asList(15,18,13,10,17));

        static int tutar;


    public static void main(String[] args) {
        System.out.println("YILDIZ MANAV");
        urunsec();


    }
    private static void urunsec(){
        Scanner scan=new Scanner(System.in);
        System.out.println("URUN SECİNİZ: ");

        for (String each: urunListesi) {
            System.out.println(each);
            
        }
        System.out.println("SECİNİZ");
        int secim= scan.nextInt();

        System.out.println("Kac kilo urun alcaksiniz");
        int miktar= scan.nextInt();

        tutar+=miktar*fiyatListesi.get(secim-1);

        System.out.println("Alisverise devam etmek istiyormusunuz?(E/H");
        char cikis=scan.next().toUpperCase().charAt(0);

        if (cikis=='H'){
            System.out.println("Odenecek tutar :"+tutar);
            System.exit(0);
        }else {
            urunsec();
        }
    }
}
