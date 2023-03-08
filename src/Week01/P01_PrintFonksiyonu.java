package Week01;

public class P01_PrintFonksiyonu {
    public static void main(String[] args) {

        // Burasi yorum satiri
        /*
        Buraya satirlarca yorum yazabiliriz
         */
       /*
        Soru - 1
        Konsola Hello World ve "Hello World"
         yazdiriniz.
        */
        //System.out.println("Hello World");
        //System.out.println("\"Hello World\"");

        /*
        Soru - 2
        Konsola
        "Hello  \
        'World' \/"
        yazdiriniz
         */
        /*
        \n  :bir alt satirdan yazmaya baslar
        \t  :1 tab bosluk birakir
        \"  :" yazar
        \'  :' yazar
        \\  :\ yazar

         */

        //System.out.println("\"Hello\t\\\n'World'\t\\/\"");

        /*
        Soru    -3
        Deger atayarak
        Ali Can -   QA Software    Test    Engineer
         */
        String name="Ali";
        String surname="Can";
        String job="QA  Software    Test    Engineer";
        System.out.println(name+" "+surname+" - "+job);
        System.out.println("=====KOD BASARIYLA TAMAMLANDI======");

        System.out.print(name+" ");
        System.out.print(surname+" - ");
        System.out.print(job);
        System.out.print("");
        System.out.println("=====PRINTLN FARKI======");


        System.out.println(name+" ");
        System.out.println(surname+" - ");
        System.out.println(job);



        /*
        ÖDEV : Aşağıdaki gibi bir ATM karşılama ekranı yazan koda dizisini yazınız.

        ****    WISE BANK   ****
            WISE ATM’YE HOŞGELDİNİZ
            1 – Bakiye Sorgulama
            2 – Para Yatırma
            3 – Para Çekme
            4 – Bilgi Güncelleme
            5 – Kart İade
        ****    WISE BANK   ****
         */


    }
}
