package R1WesjcieWyjscie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie01k8 {
    public static void main(String[] args) {
        /*Zadanie z zadanie 1k1 uzupełnij o obslugę wyjątków
         */
        double a, b, area;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Podaj długość boku a: ");
            a = Double.parseDouble(buffer.readLine());
            System.out.println("Podaj długość boku b: ");
            b = Double.parseDouble(buffer.readLine());
            area = a * b;
            System.out.println("Pole powierzchni prostokata wynosi: " + area);
        } catch (NumberFormatException e) {
            System.out.println("Nie wprowadzono liczby, koniec programu");
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
