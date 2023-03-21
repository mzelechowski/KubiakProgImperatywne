package R3Iteracje;

public class Zadanie03k20 {
    public static void main(String[] args) {
        /*napisz program wyświetlający tabliczkę mnożenia dla liczb od 1 do 100 z
        wykorzystaniem podwójnej pętli do ... while.
         */
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print(i * j + "\t");
                j++;
            } while (j <= 10);
            System.out.println();
            i++;
        } while (i <= 10);
    }
}
