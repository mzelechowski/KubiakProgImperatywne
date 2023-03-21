package R3Iteracje;

public class Zadanie03k21 {
    public static void main(String[] args) {
        /* napisz progam wyświetlający tabliczkę mnożenia dla liczb od 1 do 100 z wykorzystaniem
        podwójnej pętli while().
         */
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print(i*j +"\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
