package R9DatyGodziny;

import java.time.LocalDate;

public class Zadanie09k1 {
    public static void main(String[] args) {
        /* nNapisz program, który pozyskuje bieżącą datę z systemowego zegara komputera.
        Dodatkowo wyświetl, następujący dzień, licząc od bieżacej daty.
         */
        System.out.println("Today's date is: "+ LocalDate.now()+".");
        System.out.println("Tomorrow's date is: "+LocalDate.now().plusDays(1)+".");
    }
}
