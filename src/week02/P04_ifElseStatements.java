package week02;

import java.util.Scanner;

public class P04_ifElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
            85-100 -----> AA
            80-85 ------> BA
            75-80 ------> BB
            65-75 ------> CB
            50-65 ------> CC
            50 Altı ise  ------> FF
          */

      // System.out.print("Lutfen notunuzu giriniz :");

      // int not = scan.nextInt();

      // if (not>=85 && not<100){
      //     System.out.println("Sinav notunuz: "+not+" Harf notunuz: AA");
      // } else if (not>=80 && not<85) {
      //     System.out.println("Sinav notunuz: "+not+" Harf notunuz: BA");

      // } else if (not>=75 && not<80) {
      //     System.out.println("Sinav notunuz: "+not+" Harf notunuz: BB");

      // } else if (not>=65 && not<75) {
      //     System.out.println("Sinav notunuz: "+not+" Harf notunuz: CB");
      // } else if (not >= 50 && not < 65) {
      //     System.out.println("Sinav notunuz: "+not+" Harf notunuz: CC");
      // }else {
        //    System.out.println("Sinav notunuz: "+not+" Harf notunuz: FF");
        //}

         /*
        2- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
            sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
            "istediginiz birim sisteme kayitli degil" yazdirin.
         */

        System.out.println("Lutfen mesafeyi kilometre olarak giriniz :");
        double km = scan.nextDouble();
        System.out.println("Lutfen donusturmek istediginiz birimi giriniz (Orne:Metre)");
        char birim =scan.next().charAt(0);
        if (birim=='m'|| birim=='M'){
            System.out.println("Girdiginiz mesafenin metre degeri :"+km*1000+" dir");
        } else if (birim=='s'|| birim=='S') {
            System.out.println("Girdiginiz mesafenin santimetre degeri :"+km*1000*100+" dir");
        }else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }

        /*
            Soru ) Interview Question
                  Kullanicidan artik yil olup olmadigini kontrol
                  etmek icin yil girmesini isteyin.
                  Kural 1: 4 ile bolunemeyen yillar artik yil  egildir
                  Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
                  Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir

             */

        /*
        1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
           Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
             KURALLAR
             : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
             : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
         */
    }
}
