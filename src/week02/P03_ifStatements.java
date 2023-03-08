package week02;

import java.util.Scanner;

public class P03_ifStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bugun gunlerden hangi gun: ");
        String gun = scan.next().toLowerCase();

        if (gun.equals("cumartesi") || gun.equals("pazar")) ;
        {

            System.out.println("Bugun hafta sonu, iyi tatiller");
        }
        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma"))
            ;
        {
//
            System.out.println("Bugun hafta ıcı, kolay gelsin");
        }

        // 2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
        //    Yıl sonu notunu vizeler %40 finaller % 60 olacak şekilde hesaplayıp
        //    Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler! olduğunu 50'den
        //    küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız

        // Ad:
        // Soyad:
        // 1.Vize:
        // 2. Vize:
        // Final :
        // Yıl Sonu Notu:
        // Ders Durumu :

        System.out.println("Lutfen isminizi giriniz");
        String name = scan.nextLine();
        System.out.println("lutfen soyadinizi giriniz");
        String surname = scan.nextLine();
        System.out.println("Lutfen vize ve final  notlarinizi girin");
        System.out.print("1.Vize noyu : ");
        int vize1 = scan.nextInt();
        System.out.print("2.vize notu :");
        int vize2 = scan.nextInt();
        System.out.print("Final notu :");
        int finalnotu = scan.nextInt();
        int yilSonuNotu = (((vize1 + vize2) / 2) * 40 / 100) + (finalnotu * 60 / 100);
        System.out.println("adiniz : " + name);
        System.out.println("Soyadiniz : " + surname);
        System.out.println("1.vize: " + vize1);
        System.out.println("2.vize : " + vize2);
        System.out.println("Final : " + finalnotu);
        System.out.println("Yıl sonu notu : " + yilSonuNotu);

        if (yilSonuNotu >= 50) {
            System.out.println("Ders Durumu : Gectiniz Tebrikler");
        }
        if (yilSonuNotu < 50) {
            System.out.println("Ders Durumu : Malesef Kaldiniz");
        }


    }


}
