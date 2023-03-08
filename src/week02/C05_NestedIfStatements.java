package week02;

import java.util.Scanner;

public class C05_NestedIfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("İşe başlama yılınızı ve ayinizi 1999.09 şeklinde giriniz");
        double giris = scan.nextDouble();

        if (giris > 1999.09) {
            System.out.println("Siz EYT Kanun düzenlemesine tabi değilsiniz");
        } else {
            System.out.println("Lutfen cinsiyetinizi E ya da K olarak giriniz");

            char cinsiyet = scan.next().charAt(0);

            System.out.println("Lutfen pirim gün sayısını giriniz");
            int primGun = scan.nextInt();
            System.out.println("Lutfen hizmet sürenizi yıl olarak giriniz: ");
            int yil = scan.nextInt();

            if (cinsiyet=='E'||cinsiyet=='e'){
                if (primGun>=5500 && yil>=25){
                    System.out.println("Tebrikler EYT kanunu yürülüğe girdiğinde emekli olabilirsiniz!");
                } else if (primGun<5500&& yil>=25) {
                    System.out.println("Kanun yürürlüğe girince "+(5500-primGun)+" sartını tamamlamanız gerekmektedir.");

                } else if (primGun>=500 && yil<25) {
                    System.out.println("Kanun yürülüğe girince "+(25-yil)+" yıl daha çalışmalısınız.");
                }
            } else if (cinsiyet=='K'||cinsiyet=='k') {
                if (primGun>=5000&&yil>=20){
                    System.out.println("Tebrikler EYT kanunu yürülüğe girdiğinde emekli olabilirsiniz!");
                } else if (primGun<5000&&yil>=20) {
                    System.out.println("Kanun yürürlüğe girince "+(5000-primGun)+" sartını tamamlamanız gerekmektedir.");
                } else if (primGun >= 5000 && yil < 20) {
                    System.out.println("Kanun yürülüğe girince "+(20-yil)+" yıl daha çalışmalısınız.");
                }

            }else {
                System.out.println("Yanlış bir değer giriniz");
            }
        }
    }
}
