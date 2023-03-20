package R2Instrukcje;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Zadanie02k3 {
    public static void main(String[] args) {
        /*Napisz program który oblicza pierwiastki równania kwadratowego
        przy pomocy instrukcji switch
         */
        double a, b, c, delta, x1, x2;
        int liczba_pierw = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program oblicza pierwiastki rónwnania ax^2+bx+c=0");
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
            if (delta < 0) liczba_pierw = 0;
            if (delta == 0) liczba_pierw = 1;
            if (delta > 0) liczba_pierw = 2;
            switch (liczba_pierw) {
                case 0:
                    System.out.println("Brak pierwiastków rzeczywistych");
                    break;
                case 1:
                    x1 = -b / (2 * a);
                    System.out.printf("Trójmian ma jednej pierwiastek" + "%2.2f", x1);
                    break;
                case 2:
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
