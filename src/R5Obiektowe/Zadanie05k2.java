package R5Obiektowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

class Trinomial {
    private double a, b, c, delta, x1, x2;
    private char amountOfSquare;

    public void readData() throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Oblicza pierwiastki rownania kwadratowego \n dla dowolnych wartosci a, b, c");
        System.out.println("Podaj wartosc a: ");
        a = Double.parseDouble(buf.readLine());
        if (a == b) {
            System.out.println("Niedozwolona wartosc wspolczynnika a");
            System.exit(0);
        } else {
            System.out.println("Podaj wartosc b: ");
            b = Double.parseDouble(buf.readLine());
            System.out.println("Podaj wartosc c: ");
            c = Double.parseDouble(buf.readLine());
        }
    }

    public void calculateSquars() {
        delta = b * b - 4 * a * c;
        if (delta < 0) amountOfSquare = 0;
        if (delta == 0) amountOfSquare = 1;
        if (delta > 0) amountOfSquare = 2;
        switch (amountOfSquare) {
            case 1:
                x1 = -b / (2 * a);
                break;
            case 2:
                x1 = (-b-Math.sqrt(delta)/(2*a));
                x2 = (-b+Math.sqrt(delta)/(2*a));
                break;
        }
    }
    public void printData(){
        System.out.println("Dla wprowadzonych licz: ");
        System.out.printf("a= "+"%2.2f, ", a);
        System.out.printf(" b= "+"%2.2f, ", b);
        System.out.printf(" c= "+"%2.2f, ", c);
        switch (amountOfSquare){
            case 0:
                System.out.print(" brak pierwiastków rzeczywistych");
                break;
            case 1:
                System.out.printf(" trójmian ma jeden pierwiastek podwójny: x1= %2.2f.",x1);
                break;
            case 2:
                System.out.print(" trójmian ma dwa pierwiastki: ");
                System.out.printf("x1= "+"%2.2f", x1);
                System.out.printf(" oraz x2= "+"%2.2f.", x2);
                break;
        }
    }
}

public class Zadanie05k2 {
    public static void main(String[] args) throws IOException {
        Trinomial tri = new Trinomial();
        tri.readData();
        tri.calculateSquars();
        tri.printData();

    }
}
