package R3Iteracje;

public class Zadanie03k26 {
    public static void main(String[] args) {
        /*Napisz program, który oblicza przybliżoną wartość liczby Eulera e2.*/
        double dokladnosc=1.0e-15;
        long silnia=1;
        double e=2.0;
        int n=2;
        double e0;

        do{
            e0=e;
            silnia*=n++;
            e+=1.0/silnia;
        }while(Math.abs(e-e0)>=dokladnosc);
        System.out.printf("Obliczone e=%.15f.\n", e);
        System.out.println("Stała e=  "+Math.E+".");
    }
}
