package week04;

import java.util.Scanner;

public class P01_forLoop {
    public static void main(String[] args) {
        /*
           Soru- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
                 dahil) 7 ila bolunebilen sayilari yazdirin.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();
        System.out.println("");
        for (int i = 1; i <=girilenSayi ; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("");
        System.out.println("");

        System.err.println("================  ISLEM TAMAMLANDI  =================");


    }
}
