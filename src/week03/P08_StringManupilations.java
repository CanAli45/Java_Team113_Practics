package week03;

import java.util.Scanner;

public class P08_StringManupilations {
    public static void main(String[] args) {
        /*
            1-Kullanicidan isim ve soyismini ayri ayri alin.
              ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
              soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk,
              soyismi buyuk harflerle yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String name=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String surName=scan.nextLine();

        if (name.length()>surName.length()){
            name=name.substring(0,1).toUpperCase()+name.substring(1,name.length());
            surName=surName.substring(0,1).toUpperCase()+surName.substring(1,surName.length());
            System.out.println(name+" "+surName);
        }
        if (name.length()<surName.length()){
            name=name.substring(0,1).toUpperCase()+name.substring(1,name.length());
            surName=surName.toUpperCase();
            System.out.println(name+" "+surName);
        }

    }
}
