package R3Iteracje;

public class Zadanie03k22 {
    public static void main(String[] args) {
        /*Napisz program któy wyświetla dużle litery alfabeto od A do Z i od Z od A
           z wykorzystaniem petli for      */
        for(char z='A';z<='Z';z++){
            System.out.print(z+",");
        }
        System.out.println();
        for(char z='Z';z>='A';z--){
            System.out.print(z+",");
        }
    }
}
