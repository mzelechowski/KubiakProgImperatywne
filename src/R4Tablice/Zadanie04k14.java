package R4Tablice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie04k14 {
    public static void main(String[] args) throws IOException {
        /*Napisz program, który składa dwa łańcuchy, a wynik tej operacji wyświetla na
        ekranie monitora
         */
        BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program składa dwa łańcuchy");
        System.out.println("Podaj pierwszy łańcuch: ");
        String lancuch1=buffer.readLine();
        System.out.println("Podaj drugi lancuch: ");
        String lancuch2=buffer.readLine();
        System.out.println(lancuch1+"+"+lancuch2+"="+lancuch1.concat(lancuch2));
        System.out.println(lancuch2+"+"+lancuch1+"="+lancuch2.concat(lancuch1));


    }
}
