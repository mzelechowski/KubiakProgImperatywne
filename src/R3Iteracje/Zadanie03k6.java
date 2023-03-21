package R3Iteracje;

public class Zadanie03k6 {
    public static void main(String[] args) {
        /*napisz program, który za pomocą instrukcji while() wyświetla liczby od 1 do 20
         */
        int i=1;
        while(i<=20) {
            if(i<20)
                System.out.print(i+",");
            else
                System.out.println(i+".");
            i++;
        }
    }
}
