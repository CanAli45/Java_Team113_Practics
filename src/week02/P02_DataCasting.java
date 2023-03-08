package week02;

import java.util.Scanner;

public class P02_DataCasting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        //double a =3, b=9, c=7;

        //double toplam =(a+b+c);
        //System.out.println("Toplam = "+(int)toplam);

            /*
         2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
            Girdiğiniz harf :
            Girdiğiniz harften sonraki  3 harf :
            şeklinde yazdrın.
            ipucu: char
            */


        //Scanner scan = new Scanner(System.in);

        //System.out.println("Lutfen bir harf giriniz");
        //char harf = scan.next().charAt(0);

        //System.out.println("Girdiginiz harf :" + harf);
        //System.out.println("Girdiginiz harften sonraki 3 harf :" + (char) (harf + 1) + ", " +
        //         (char) (harf + 2) + ", " + (char) (harf + 3)+", dir");


            /*
            3- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
            sonucu tam sayı yazdırın
            ipucu: sorumluluk bende
             */
        System.out.println("Lutfen 2 adet ondalikli sayi giriniz: ");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        int toplam = (int) (sayi1 / sayi2);

        System.out.println("Sonuc :" + toplam);


             /*
            1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
                Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
                *** String icin equals method'unusalı kullanin
             */



    }


}
