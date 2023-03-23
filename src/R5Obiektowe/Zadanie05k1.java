package R5Obiektowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Rectangle{
    private double a;
    private double b;
    private double surface;

    public Rectangle() {
    }


    public void readData(){
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj boki prostokata");

        try {
            System.out.println("Podaj bok a: ");
            this.a = Double.parseDouble(buf.readLine());
            System.out.println("Podaj bok b: ");
            this.b = Double.parseDouble(buf.readLine());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void calculateSufrace(){
        surface=a*b;
    }
    public void printRectangle(){
        System.out.printf("Pole prostokąta o boku a = %2.2f", a);
        System.out.printf(" i boku b= %2.2f", b);
        System.out.printf(" wynosi %2.2f", surface);
        System.out.print(".");
    }
}

public class Zadanie05k1 {
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.readData();
    rectangle.calculateSufrace();
    rectangle.printRectangle();
    }
}
