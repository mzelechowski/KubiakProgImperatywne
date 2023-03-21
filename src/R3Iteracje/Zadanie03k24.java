package R3Iteracje;

public class Zadanie03k24 {
    public static void main(String[] args) {
        /*Napisz program któy wyświetla dużle litery alfabeto od A do Z i od Z od A
           z wykorzystaniem petli while()     */
        char z='A';
        while(z<='Z'){
            System.out.print(z+",");
            z++;
        }
        System.out.println();
        z='Z';
        while(z>='A'){
            System.out.print(z+",");
            z--;
        }
    }
}
