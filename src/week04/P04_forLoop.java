package week04;

import java.util.Scanner;

public class P04_forLoop {
    public static void main(String[] args) {
        /*
              Soru -  Kullanicidan bir String isteyin ve String'i tersine cevirip
                      kaydedin.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime= scan.nextLine();
        String yeniKelime="";

        for (int i = kelime.length()-1; i >=0 ; i--) {

            yeniKelime+=kelime.charAt(i);
        }
        System.out.print(yeniKelime);

    }
}
