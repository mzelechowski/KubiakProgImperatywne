package R3Iteracje;

public class Zadanie03k14 {
    public static void main(String[] args) {

        /*napisz program, który przy pomocy pętli do-wile() sumuje liczby nieparzyste całkowite od 1 do 100
         */
        int sum = 0;
        int i = 1;
        do {
            if (i % 2 != 0)
                sum += i;
            i++;
        } while (i <= 100);
        System.out.println("Suma liczb całkowitych nieparzystych od 1 do 100 wynosi: " + sum);
    }
}
