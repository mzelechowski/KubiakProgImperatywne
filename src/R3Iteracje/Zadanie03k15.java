package R3Iteracje;

public class Zadanie03k15 {
    public static void main(String[] args) {
        /*napisz program, który przy pomocy pętli wile() sumuje liczby nieparzyste całkowite od 1 do 100
         */
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0)
                sum += i;
            i++;
        }
        System.out.println("Suma liczb całkowitych nieparzystych od 1 do 100 wynosi: " + sum);
    }
}
