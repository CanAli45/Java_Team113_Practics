package OgrenciPractics;

import java.util.Scanner;

public class C01_SoruCozme {
    public static void main(String[] args) {
        /*
        //Kullanıcının girdiği bir sayının,
          çift veya tek olduğunu kontrol eden bir program yazın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");

        int girilenSayi=scan.nextInt();
        if (girilenSayi>=0) {

            if (girilenSayi % 2 == 0) {
                System.out.println("Girilen sayi çift sayidir");
            } else {
                System.out.println("Girilen sayi tek sayidir");
            }
        }else {
            System.out.println("Girilen sayi negatiftir, girilen sayi pozitif olmali");
        }






    }
}
