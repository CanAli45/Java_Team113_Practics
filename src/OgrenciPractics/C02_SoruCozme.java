package OgrenciPractics;

import java.util.Scanner;

public class C02_SoruCozme {
    public static void main(String[] args) {

        //Kullanıcının girdiği bir karakterin,
        // harf olup olmadığını kontrol eden bir program yazın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk=scan.next().toLowerCase().charAt(0);
        if (krk>='a'&&krk<='z'){
            System.out.println("Girilen karakter harftir");
        }else {
            System.out.println("Girilen karakter harf degildir");
        }
    }
}
