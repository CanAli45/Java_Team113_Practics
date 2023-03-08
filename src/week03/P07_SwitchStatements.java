package week03;

import java.util.Scanner;

public class P07_SwitchStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
            1-Kullanicidan bir rakam alip, rakami yaziyla yazdirin
         */
        //System.out.println("Lutfen bir rakam giriniz");
        //int rakam= scan.nextInt();

        //switch (rakam){
        //    case 0:
        //        System.out.println("Sifir");
        //        break;
        //    case 1:
        //        System.out.println("Bir");
        //        break;
        //    case 2:
        //        System.out.println("İki");
        //        break;
        //    case 3:
        //        System.out.println("Uc");
        //        break;
        //    case 4:
        //        System.out.println("Dort");
        //        break;
        //    case 5:
        //        System.out.println("Bes");
        //        break;
        //    case 6:
        //        System.out.println("Altı");
        //        break;
        //    case 7:
        //        System.out.println("Yedi");
        //        break;
        //    case 8:
        //        System.out.println("Sekiz");
        //        break;
        //    case 9:
        //        System.out.println("Dokuz");
        //        break;
        //    default:
        //        System.out.println("Rakam 0-9 arasinda olmalidir, yanlıs deger girdiniz");
        //}
            /*
            2-Kullanicidan ay numarasini alip ay ismini yazdirin
            */

       // System.out.println("Lutfen adini merak ettiginiz ay numarasini giriniz");
       // int ayno= scan.nextInt();
       // switch (ayno){
       //     case 1:
       //         System.out.println("Ocak");
       //         break;
       //     case 2:
       //         System.out.println("Subat");
       //         break;
       //     case 3:
       //         System.out.println("Mart");
       //         break;
       //     case 4:
       //         System.out.println("Nisan");
       //         break;
       //     case 5:
       //         System.out.println("Mayis");
       //         break;
       //     case 6:
       //         System.out.println("Haziran");
       //         break;
       //     case 7:
       //         System.out.println("Temmuz");
       //         break;
       //     case 8:
       //         System.out.println("Agustos");
       //         break;
       //     case 9:
       //         System.out.println("Eylul");
       //         break;
       //     case 10:
       //         System.out.println("Ekim");
       //         break;
       //     case 11:
       //         System.out.println("Kasim");
       //         break;
       //     case 12:
       //         System.out.println("Aralik");
       //         break;
       //     default:
       //         System.out.println("Gecersiz deger girdiniz");
       // }
             /*
             3-Kullanicidan ay numarasini alip mevsimini yazidirin.
              */
       // System.out.println("Lutfen mevsimini ogrenmek istediginiz ayın numarasini giriniz");
       // int ayNo= scan.nextInt();
       // switch (ayNo){
       //     case 12:case 1: case 2:
       //         System.out.println("Mevsim :Kıs");
       //         break;
       //     case 3:case 4: case 5:
       //         System.out.println("Mevsim :Ilkbahar");
       //         break;
       //     case 6:case 7: case 8:
       //         System.out.println("Mevsim :Yaz");
       //         break;
       //     case 9: case 10: case 11:
       //         System.out.println("Mevsim :Sonbahar");
       //         break;
       //     default:
       //         System.out.println("Gecersiz bir deger girdiniz");
       // }
            /*
             4-Kullanıcıdan yılı ve ay numarasını alıp o yıldaki o ayda kaç gün olduğunu yazdırın

             */
        System.out.println("Bilgi istediginiz yılı giriniz: ");
        int year= scan.nextInt();

        System.out.println("Gun sayisini merak ettiginiz ayin kacinci ay oldugunu giriniz :");
        int ayNo= scan.nextInt();
        int numDays=0;

        switch (ayNo){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDays=31;
                System.out.println("Girdiginiz yildaki ayin gun sayisi :"+numDays);
                break;
            case 4: case 6: case 9: case 11:
                numDays=30;
                System.out.println("Girdiginiz yildaki ayin gun sayisi :"+numDays);
                break;
            case 2:
                numDays=(year % 4 == 0 &&! (year % 100 == 0 || year % 400 == 0) ? 29 : 28);
                System.out.println("Girdiginiz yildaki ayin gun sayisi :"+numDays);
                break;
            default:
                System.out.println("Gecersiz ay");
        }



    }
}
