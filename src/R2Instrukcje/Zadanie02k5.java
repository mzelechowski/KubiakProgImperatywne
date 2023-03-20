package R2Instrukcje;

import java.util.Scanner;

public class Zadanie02k5 {
    public static void main(String[] args) {
        /*Napisz program, któy generuje liczbę losową z przedziału 0 do 9

         */
        int losowa=((int) Math.floor(Math.random()*10));
        Scanner scanner = new Scanner(System.in);
        System.out.println(losowa);
        System.out.println("Podaj liczbę");
        int a = scanner.nextInt();
        if(a==losowa)
            System.out.println("Zgadłes");
        else
            System.out.println("Spróbuj ponownie szczecia");
    }
}
