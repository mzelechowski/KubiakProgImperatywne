package R3Iteracje;

public class Zadanie03k10 {
    public static void main(String[] args) {
        /*napisz program, który przy pomocy pętli for sumuje liczby całkowite parzyste od 1 do 100
         */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                sum += i;
        }
        System.out.println("Suma liczb całkowitych parzystych od 1 do 100 wynosi: " + sum);
    }
}
