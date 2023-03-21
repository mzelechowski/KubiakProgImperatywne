package R3Iteracje;

public class Zadanie03k9 {
    public static void main(String[] args) {
        /*napisz program, który przy pomocy pętli wile() sumuje liczby całkowite od 1 do 100
         */
        int sum=0;
        int i=1;
        while(i<=100) {
            sum += i++;
        }
        System.out.println("Sumal liczb całkowitych od 1 do 100 wynosi: "+sum);
    }
}
