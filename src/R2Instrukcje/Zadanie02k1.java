package R2Instrukcje;

import java.util.Scanner;

public class Zadanie02k1 {
    public static void main(String[] args) {
        /*sprawdz dla trzech boków czy trójkąt jest prostokątny*/
        int a, b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok trójkata a= ");
        a=scanner.nextInt();
        System.out.println("Podaj drugi bok trójkata b=: ");
        b=scanner.nextInt();
        System.out.println("Podaj trzeci bok trójkata c=  ");
        c=scanner.nextInt();
        if(a*a+b*b ==c*c)
            System.out.println("Trójkąt o bokach: "+a+", "+b+", "+c+" jest trójkątem prostokątnym.");
        else
            System.out.println("Trójkąt o bokach: "+a+", "+b+", "+c+" nie jest trójkątem prostokątnym.");
    }
}
