package R2Instrukcje;

import java.util.Scanner;

public class Zadanie02k2 {
    public static void main(String[] args) {
        /* Napisz program, który oblicza pierwiastki równania kwadratowego ax2+bx+c=0
        z wykorzystanie instrukcji warunkowj if. Zmienne a,b,c wprowadzamy z klawiatury
        Dla zmiennych x2, a, b,c należy przyjąc format z dokładnością do dwóch miejsc
        po przecienku
         */
        double a, b, c, delta, x1, x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a= ");
        a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Niedozwolona wartość współczynnika a.");
        } else {

            System.out.println("Podaj b= ");
            b = scanner.nextDouble();
            System.out.println("Podaj c=  ");
            c = scanner.nextDouble();
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Brak pierwiastków rzeczywistych");
            } else {
                if (delta == 0) {
                    x1 = -b / (2 * a);
                    System.out.printf("Trójmian ma jednej pierwiastek" + "%2.2f", x1);
                } else {
                    x1 = (-b - Math.sqrt(delta)) / (2 * a);
                    x2 = (-b + Math.sqrt(delta)) / (2 * a);
                    System.out.println("Trójmian ma dwa pierwiastki");
                    System.out.printf("X1=" + "%2.2f", x1);
                    System.out.println();
                    System.out.printf("X2=" + "%2.2f", x2);
                }
            }
        }
    }
}
