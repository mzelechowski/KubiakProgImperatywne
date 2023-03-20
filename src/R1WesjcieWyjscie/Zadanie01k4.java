package R1WesjcieWyjscie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie01k4 {
    public static void main(String[] args) throws IOException {
        /*Napisz porogam, który oblicza objętość kuli o promieniu.
        Wartość promienia wprowadzamy z klawiatury. W programie należy przyjąć, że
        zmienne promień r oraz objętość są typu dobule. Dla tych zmiennych dokądność wyświetlania
        na ekranie należy przyjąć do dwóch miejsc po przcinku.
         */
        double r, volume;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj wartosc promienia kuli: ");
        r = Double.parseDouble(buff.readLine());
        volume = 4 * Math.PI * r * r * r / 3;
        System.out.printf("Objetość kuli o promieniu: " + "%.2f", r);
        System.out.printf(" wynosi: " + "%.2f.", volume);
    }
}

