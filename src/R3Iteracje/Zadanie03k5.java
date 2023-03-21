package R3Iteracje;

public class Zadanie03k5 {
    public static void main(String[] args) {
        /*napisz program, który za pomocą instrukcji do-while() wyświetla liczby od 1 do 20
         */
        int i=1;
        do {
            if(i<20)
                System.out.print(i+",");
            else
                System.out.println(i+".");
            i++;
        } while(i<=20);
    }
}
