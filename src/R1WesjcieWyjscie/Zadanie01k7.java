package R1WesjcieWyjscie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie01k7 {
    public static void main(String[] args) throws IOException {
        /*Napisz program, który oblicza sumę, różnice, iloczyn i iloraz dla dwóch liczba x i y,
        wprowadzonych z klawiatury. W programie należy założyc, że zmienne x i y są typu float.
        Dla zmiennych x,y wyniki wyśietlić z dokładnoscią 2 miejsc po przecinku
         */
        float x, y;
        BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj wartosc x: ");
        x=Float.parseFloat(buf.readLine());
        System.out.println("Podaj wartosc y: ");
        y=Float.parseFloat(buf.readLine());
        System.out.printf("Suma liczb x oraz y wynosi: "+"%2.2f\n",x+y);
        System.out.printf("Różnica liczb x oraz y wynosi: "+"%2.2f\n",x-y);
        System.out.printf("Iloczyn liczb x oraz y wynosi: "+"%2.2f\n",x*y);
        System.out.printf("Iloraz liczb x oraz y wynosi: "+"%2.2f\n",x/y);
    }
}
