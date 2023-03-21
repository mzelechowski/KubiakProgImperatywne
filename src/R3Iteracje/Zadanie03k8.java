package R3Iteracje;

public class Zadanie03k8 {
    public static void main(String[] args) {
        /*napisz program, który przy pomocy pętli do-wile() sumuje liczby całkowite od 1 do 100
         */
        int sum=0;
        int i=1;
        do {
            sum += i++;
        } while(i<=100);
        System.out.println("Sumal liczb całkowitych od 1 do 100 wynosi: "+sum);
    }
}
