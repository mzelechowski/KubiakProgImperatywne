package R2Instrukcje;

import java.util.Scanner;

public class Zadanie02k6 {
    public static void main(String[] args) {
        /* Napisz program, który ilustruje działanie operatora warunkowego trójskładniokowego (? :)

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe całkowita: ");
        int a = scanner.nextInt();
        System.out.println(a % 2 == 0 ? "Podana liczba jest parzyta" : "Podana liczba jest nieparzyta");

    }
}
