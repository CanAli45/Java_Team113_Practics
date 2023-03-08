package Abd_Practics;

import java.util.ArrayList;
import java.util.Scanner;

public class P01_Fibonacci {
    public static void main(String[] args) {
        // Kullanicidan alinan bir tamsayiya kadar FIBONACCI dizisi olusturun.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();
        fibonacci(sayi);

    }

    private static void fibonacci(int sayi) {
        ArrayList<Integer> fibo=new ArrayList<>();
        fibo.add(1);
        fibo.add(1);
        for (int i = 2; i <sayi ; i++) {
            fibo.add(fibo.get(i-2)+fibo.get(i-1));

        }
        System.out.println(fibo);
    }

}
