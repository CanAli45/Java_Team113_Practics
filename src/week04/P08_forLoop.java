package week04;

import java.util.Scanner;

public class P08_forLoop {
    public static void main(String[] args) {

        //Soru - Verilen bir poztif tam sayinin
        //       pozitif tam bolenlerini yazdiralim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.print(i+" ");
            }
        }

    }
}
