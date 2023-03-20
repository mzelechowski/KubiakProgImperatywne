package R1WesjcieWyjscie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie01k1 {
    public static void main(String[] args) {
        /*Napisz program który oblicza pole prostokąta. Wartości bloków a i b wprowadzamy z klawiatury
        W programie należy przyjąć, że zmienne typu a,b oraz pole są typu dobule
         */
        double a, b, area;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Podaj długość boku a: ");
            a = Double.parseDouble(buffer.readLine());
            System.out.println("Podaj długość boku b: ");
            b = Double.parseDouble(buffer.readLine());
            area=a*b;
            System.out.println("Pole powierzchni prostokata wynosi: " + area);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
