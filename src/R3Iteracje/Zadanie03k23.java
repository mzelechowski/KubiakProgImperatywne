package R3Iteracje;

public class Zadanie03k23 {
    public static void main(String[] args) {
        /*Napisz program któy wyświetla dużle litery alfabeto od A do Z i od Z od A
           z wykorzystaniem petli do-while()      */
        char z='A';
        do{
            System.out.print(z+",");
            z++;
        } while(z<='Z');
        System.out.println();
        z='Z';
        do{
            System.out.print(z+",");
            z--;
        } while(z>='A');
    }
}
