package week03;

import java.util.Scanner;

public class P06_TernaryOperator {
    public static void main(String[] args) {

        /*  1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
               ucgen eskenar ise"Eskenar ucgen" yazdirin,
               degilse "Eskenar degil" yazdirin.

         */

        Scanner scan = new Scanner(System.in);

      // System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz, her girisinizde ENTER tusuna basiniz.");
      // System.out.print("1.Kenar uzunlugu : ");
      // int kenar1 = scan.nextInt();
      // System.out.print("2.Kenar uzunlugu : ");
      // int kenar2 = scan.nextInt();
      // System.out.print("3.Kenar uzunlugu : ");
      // int kenar3 = scan.nextInt();

      // System.out.println(kenar1 > 0 ? (kenar1 == kenar2 && kenar1 == kenar3 ? "Eskenar ucgen" : "Eskenar ucgen degil") : "Yanlıs giris yaptiniz");

       /*   2- Kullanicidan bir harf isteyin,
               girilen karakter kucuk harf ise onu buyuk
               harf olarak yazdirin, yoksa girilen harfi yazdirin

        */

        //System.out.println("Lutfen bir harf giriniz");
        //char krk = scan.next().toUpperCase().charAt(0);
        // System.out.println((krk >= 97 && krk <= 122) ? (char) (krk - 32) : krk);
        //System.out.println(krk);
        /*
            3-Kullanicidan 2 adet sayi isteyin ve büyük olmayani yazdirin.
         */
        //System.out.println("Lutfen 2 sayi giriniz");
        //System.out.print("1.Sayi : ");
        //double sayi1= scan.nextDouble();
        //System.out.print("2.Sayi : ");
        //double sayi2= scan.nextDouble();

        //System.out.println(sayi1>sayi2?"Buyuk olmayan sayi :"+sayi2:"Buyuk olmayan sayi :"+sayi1);

        /*
            4-Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin",
              50’den kucukse "Maalesef kaldin" yazdirin.
         */
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();
        System.out.println(not>=50?"Sinifi Gectin":"Maalesef kaldin");


    }
}
