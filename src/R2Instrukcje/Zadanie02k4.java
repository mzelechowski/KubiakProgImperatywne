package R2Instrukcje;

import java.util.Scanner;

public class Zadanie02k4 {
    public static void main(String[] args) {
        /*Napisz program, który oblicza wartosc x z rownania ax+b=c.
        Wartosc a, b i c nalezą do zbioru liczb rzeczywistych i są wprowadzane z klawiatury
        Nalezy zabezpieczyc program przez mozliwosć wprowadznia a=0
         */
        double a, b, c, x;
        int liczba_pierw = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program oblicza x z równania ax+b=c");
        System.out.println("Podaj a= ");
        while((a=scanner.nextDouble())==0){
            System.out.println("Podaj a!=0 a= ");
        }
        System.out.println("Podaj b= ");
        b = scanner.nextDouble();
        System.out.println("Podaj c=  ");
        c = scanner.nextDouble();
        x=(c-b)/a;
        System.out.printf("Wartosc x wynosi: "+"%2.2f",x);
    }
}
