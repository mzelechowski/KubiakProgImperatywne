package R4Tablice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie04k13 {
    public static void main(String[] args) throws IOException {
        String imie, nazwisko;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program mierzy długość łańcucha imię i nazwisko");
        System.out.println("Podaj imie: ");
        imie = buffer.readLine();
        System.out.println("Podaj nazwisko: ");
        nazwisko = buffer.readLine();
        System.out.println("Imie " + imie + " zawiera " + imie.length() + " liter.");
        System.out.println("Nazwisko " + nazwisko + " zawiera " + nazwisko.length() + " liter.");
    }
}
