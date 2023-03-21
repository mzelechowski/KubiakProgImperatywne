package R3Iteracje;

public class Zadanie03k7 {
    public static void main(String[] args) {
        /*napisz program, który przy pomocy pętli for sumuje liczby całkowite od 1 do 100
         */
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        System.out.println("Sumal liczb całkowitych od 1 do 100 wynosi: "+sum);
    }
}
